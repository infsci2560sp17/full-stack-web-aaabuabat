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

    private static final Logger log = LoggerFactory.getLogger(FullStackWebApplication.class);

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(FullStackWebApplication.class, args);

        iRestaurantRepository repository = ctx.getBean(iRestaurantRepository.class);
        repository.save(new iRestaurant(1L, "Biryani", CuisineType.Indian , MealTime.Dinner, MealType.Main_Course , "Rice + Chicken"));
        repository.save(new iRestaurant(2L, "Kunafa", CuisineType.Mediterranean , MealTime.Dinner, MealType.Dessert , "crunchy shredded phyllo pastry"));
        repository.save(new iRestaurant(3L, "Pizza", CuisineType.Westren , MealTime.Lunch, MealType.Main_Course , "Just Pizza"));
      
   
    }
}

    
    
    
    
    
    
//    @Bean
//    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//        return args -> {
//
//            System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//            }
//
//        };**/
/*/    }
    @Bean
    public CommandLineRunner databaseDemo(CustomerRepository repository) {
        return (args) -> {
            // save a couple of customers
            repository.save(new Customer("Jack", "Bauer"));
            repository.save(new Customer("Chloe", "O'Brian"));
            repository.save(new Customer("Kim", "Bauer"));
            repository.save(new Customer("David", "Palmer"));
            repository.save(new Customer("Michelle", "Dessler"));
            repository.save(new Customer("Billy", "Bean"));

            // fetch all customers
            log.info("[Database Demo] Customers found with findAll():");
            log.info("[Database Demo] -------------------------------");
            for (Customer customer : repository.findAll()) {
                log.info("[Database Demo] " + customer.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            Customer customer = repository.findOne(1L);
            log.info("[Database Demo] Customer found with findOne(1L):");
            log.info("[Database Demo] --------------------------------");
            log.info("[Database Demo] " + customer.toString());            

            // fetch customers by last name
            log.info("[Database Demo] Customer found with findByLastName('Bauer'):");
            log.info("[Database Demo] --------------------------------------------");
            for (Customer bauer : repository.findByLastName("Bauer")) {
                log.info("[Database Demo] " + bauer.toString());
            }            
        };
    }
}
**/