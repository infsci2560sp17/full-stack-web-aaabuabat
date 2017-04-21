package edu.infsci2560;

import edu.infsci2560.models.iRestaurant;
import edu.infsci2560.models.iRestaurant.CuisineType;
import edu.infsci2560.models.iRestaurant.MealTime;
import edu.infsci2560.models.iRestaurant.MealType;
import edu.infsci2560.models.Ingredient;
import edu.infsci2560.models.Ingredient.Unit;
import edu.infsci2560.models.Directions;
import edu.infsci2560.models.KitchenKit;
//import edu.infsci2560.models.Directions;
//import edu.infsci2560.models.KitchenKit;
import edu.infsci2560.repositories.iRestaurantRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import java.util.ArrayList;
import java.util.List;
//import java.util.Arrays;


@SpringBootApplication

public class FullStackWebApplication {

    private static final Logger log = LoggerFactory.getLogger(FullStackWebApplication.class);
    private static final long serialVersionUID = 1L;
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(FullStackWebApplication.class, args);
        iRestaurantRepository repository = ctx.getBean(iRestaurantRepository.class);


        
   
        /*repository.save(new iRestaurant(2L, "Kunafa", CuisineType.Mediterranean , MealTime.Dinner, MealType.Dessert , "crunchy shredded phyllo pastry"));
          repository.save(new iRestaurant(3L, "Pizza", CuisineType.Westren , MealTime.Lunch, MealType.Main_Course , "Just Pizza")); */
                            
            iRestaurant x = new iRestaurant( 
            1L,
            "Biryani", 
            CuisineType.Indian, 
            MealTime.Dinner, 
            MealType.Main_Course, 
            "Rice + Meat");
        
            List<Ingredient> ingredients = new ArrayList<Ingredient>(){{
            add(new Ingredient("1 1/2", Unit.Tablespoon, "Salt", x));
            add(new Ingredient("1", Unit.Pound, "Rice", x));
            add(new Ingredient("2", Unit.Tablespoon, "chopped fresh parsle", x));
            add(new Ingredient("2", Unit.Pound, "Meat", x));
            add(new Ingredient("1", Unit.Tablespoon, "Oil", x));
            }};
                x.setIngredients(ingredients);
     
            List<Directions> directions = new ArrayList<Directions>(){{
            add(new Directions("Preheat oven broiler", x));
            add(new Directions("Mix items together", x));
            add(new Directions("chopped fresh parsle", x));
            }};
                x.setDirections(directions);
                
            List<KitchenKit> kitchenKit = new ArrayList<KitchenKit>(){{
            add(new KitchenKit("Pot", x));
            add(new KitchenKit("Spons", x));
            add(new KitchenKit("Knives", x));
            }};
                x.setKitchenKit(kitchenKit);
     
     
        repository.save(x);
                    
    //===================================================================================================================
    
    iRestaurant y = new iRestaurant( 
            2L,
            "Kunafa", 
            CuisineType.Mediterranean, 
            MealTime.Dinner, 
            MealType.Dessert, 
            " kind of cheese danish");
        
            List<Ingredient> ingredients1 = new ArrayList<Ingredient>(){{
            add(new Ingredient("1 1/2", Unit.Tablespoon, "rose water", y));
            add(new Ingredient("1", Unit.Pound, "Dough", y));
            add(new Ingredient("2", Unit.Tablespoon, "Nuts", y));
            add(new Ingredient("2", Unit.Pound, "cheese", y));
            add(new Ingredient("1 1/2", Unit.Cup, "sugar", y));
            }};
                y.setIngredients(ingredients1);
     
            List<Directions> directions1 = new ArrayList<Directions>(){{
            add(new Directions("Put 1 ½ cup of water in a deep pan", y));
            add(new Directions("Add ½ of a squeezed lemon", y));
            add(new Directions("Put the liquid on the stove; on medium heat", y));
            add(new Directions("Stir for 10 minutes", y));
            add(new Directions("Put the Kunafa Dough in a mixing bowl", y));
            }};
                y.setDirections(directions1);
                
            List<KitchenKit> kitchenKit1 = new ArrayList<KitchenKit>(){{
            add(new KitchenKit("bowl", y));
            add(new KitchenKit("Spons", y));
            add(new KitchenKit("Knives", y));
            }};
                y.setKitchenKit(kitchenKit1);
     
     
        repository.save(y);
                    
                    
   
    }
}

    
    
    
    
