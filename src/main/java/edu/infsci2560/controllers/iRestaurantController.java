package edu.infsci2560.controllers;

import edu.infsci2560.models.iRestaurant;
import edu.infsci2560.models.Ingredient;
import edu.infsci2560.models.KitchenKit;
import edu.infsci2560.models.Directions;
import edu.infsci2560.repositories.iRestaurantRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import javax.validation.Valid;
/*import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.util.MultiValueMap;
import java.io.IOException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;    
*/
/***
 *
 * @author aaabuabat
 */
@Controller
public class iRestaurantController {
     @Autowired
    private iRestaurantRepository repository;

    @RequestMapping(value = "irestaurant", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("irestaurant", "irestaurant", repository.findAll());
    }

    
   @RequestMapping(value = "irestaurant/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute iRestaurant irestaurant, BindingResult result) {
         for (Ingredient ingredient : irestaurant.getIngredients()) {
            ingredient.setIRestaurant(irestaurant);
          }
         for (KitchenKit kitchenKits : irestaurant.getKitchenKit()) {
            kitchenKits.setIRestaurant(irestaurant);
          }
         for (Directions direction : irestaurant.getDirections()) {
            direction.setIRestaurant(irestaurant);
          }
        
        repository.save(irestaurant);  
        return new ModelAndView("irestaurant", "irestaurant", repository.findAll());
         
    }
    
        @RequestMapping(value = "irestaurant/delete/{id}", method = RequestMethod.DELETE)
        public ModelAndView delete(@PathVariable("id") Long id) {
        repository.deleteById(id);

        return new ModelAndView("redirect:/irestaurant");
    }

   @RequestMapping(value = "irestaurantUpdate/update/{id}", method = RequestMethod.GET)
    public ModelAndView index(@PathVariable("id") Long id) {
  
        iRestaurant irestaurant  = repository.findById(id);
        ModelAndView modelAndView = new ModelAndView("irestaurantUpdate");
        modelAndView.addObject("irestaurant", irestaurant);
        return modelAndView;
    }

    @RequestMapping(value = "irestaurantUpdate/update/{id}" , method =  RequestMethod.PUT, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView update(@PathVariable("id") Long id, @ModelAttribute  @Valid iRestaurant irestaurant, BindingResult result) {
          repository.deleteById(id);
         for (Ingredient ingredient : irestaurant.getIngredients()) {
            ingredient.setIRestaurant(irestaurant);
          }
         for (KitchenKit kitchenKits : irestaurant.getKitchenKit()) {
            kitchenKits.setIRestaurant(irestaurant);
          }
         for (Directions direction : irestaurant.getDirections()) {
            direction.setIRestaurant(irestaurant);
          }
        
        repository.save(irestaurant);
        return new ModelAndView("redirect:/irestaurant"); }
       
       
       
           
        
  /*@RequestMapping(value = "irestaurant/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid iRestaurant irestaurant, BindingResult result) {
        repository.save(irestaurant);
        return new ModelAndView("irestaurant", "irestaurant", repository.findAll());
    }*/
   
  /*  @RequestMapping(value = "irestaurant/{id}", method = RequestMethod.PUT, consumes = "application/json")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@Transactional
	public ModelAndView update(@RequestBody iRestaurant irestaurant, @PathVariable("id") long id) throws IOException {
		if (id != irestaurant.getId()) {
			repository.delete(id);
		}
		for (Ingredient ingredient : irestaurant.getIngredients()) {
            ingredient.setIRestaurant(irestaurant);
          }
         for (KitchenKit kitchenKits : irestaurant.getKitchenKit()) {
            kitchenKits.setIRestaurant(irestaurant);
          }
         for (Directions direction : irestaurant.getDirections()) {
            direction.setIRestaurant(irestaurant);
          }
		repository.save(irestaurant);
		return new ModelAndView("irestaurant", "irestaurant", repository.findAll());
	}*/
    

      
}
