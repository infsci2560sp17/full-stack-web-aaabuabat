package edu.infsci2560.repositories;


import edu.infsci2560.models.Ingredient;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author aaauabat
 */
public interface IngredientRepository extends PagingAndSortingRepository<Ingredient, Long> {}


