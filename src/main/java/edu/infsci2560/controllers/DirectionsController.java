package edu.infsci2560.controllers;

import edu.infsci2560.models.Directions;
import edu.infsci2560.repositories.DirectionsRepository;
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
public class DirectionsController {
    @Autowired
    private DirectionsRepository repository;
  
    @RequestMapping(value = "directions", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("directions", "directions", repository.findAll());
    }
    
    @RequestMapping(value = "directions/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid Directions directions, BindingResult result) {
        repository.save(directions);
        return new ModelAndView("directions", "directions", repository.findAll());
    }
}