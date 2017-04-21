package edu.infsci2560.controllers;

import edu.infsci2560.models.Ingredient;
import edu.infsci2560.repositories.IngredientRepository;
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
public class IngredientController {
    @Autowired
    private IngredientRepository repository;
   
    @RequestMapping(value = "ingredient", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("ingredient", "ingredient", repository.findAll());
    }
    
    @RequestMapping(value = "ingredient/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid Ingredient ingredient, BindingResult result) {
        repository.save(ingredient);
        return new ModelAndView("ingredient", "ingredient", repository.findAll());
    }
    
    
}