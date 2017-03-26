package edu.infsci2560;

import edu.infsci2560.models.iRestaurant;
import edu.infsci2560.models.iRestaurant.CuisineType;
import edu.infsci2560.models.iRestaurant.MealTime;
import edu.infsci2560.models.iRestaurant.MealType;
import edu.infsci2560.repositories.iRestaurantRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FullStackWebApplication {

//    private static final Logger log = LoggerFactory.getLogger(FullStackWebApplication.class);

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(FullStackWebApplication.class, args);

        iRestaurantRepository repository = ctx.getBean(iRestaurantRepository.class);
        

        
        repository.save(new iRestaurant(1L, "Biryani", CuisineType.Indian , MealTime.Dinner, MealType.Main_Course , "Rice + Chicken"));
        repository.save(new iRestaurant(2L, "Kunafa", CuisineType.Mediterranean , MealTime.Dinner, MealType.Dessert , "crunchy shredded phyllo pastry"));
        repository.save(new iRestaurant(3L, "Pizza", CuisineType.Westren , MealTime.Lunch, MealType.Main_Course , "Just Pizza"));
      
   
    }
}

    
    
    
    
