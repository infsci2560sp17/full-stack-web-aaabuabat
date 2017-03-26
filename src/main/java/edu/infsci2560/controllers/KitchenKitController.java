package edu.infsci2560.controllers;

import edu.infsci2560.models.KitchenKit;
import edu.infsci2560.repositories.KitchenKitRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author aaabuabat
 */
@Controller
public class KitchenKitController {
    @Autowired
    private KitchenKitRepository repository;
    
    @RequestMapping(value = "kitchenKit", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("kitchenKit", "kitchenKit", repository.findAll());
    }
    
    @RequestMapping(value = "kitchenKit/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid KitchenKit kitchenKit, BindingResult result) {
        repository.save(kitchenKit);
        return new ModelAndView("kitchenKit", "kitchenKit", repository.findAll());
    }
    
}