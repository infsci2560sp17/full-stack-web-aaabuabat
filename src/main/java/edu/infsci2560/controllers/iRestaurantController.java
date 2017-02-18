package edu.infsci2560.controllers;

import edu.infsci2560.models.iRestaurant;
import edu.infsci2560.models.iRestaurant.CuisineType;
import edu.infsci2560.models.iRestaurant.MealTime;
import edu.infsci2560.models.iRestaurant.MealType;
import edu.infsci2560.repositories.iRestaurantRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author aaabuabat
 */
@Controller
public class iRestaurantController {
     @Autowired
    private iRestaurantRepository repository;
    
    @RequestMapping(value = "meals", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("meals", "meals", repository.findAll());
    }
    
    @RequestMapping(value = "meals/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid iRestaurant meals, BindingResult result) {
        repository.save(meals);
        return new ModelAndView("meals", "meals", repository.findAll());
    }
}
