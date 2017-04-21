package edu.infsci2560.repositories;


import edu.infsci2560.models.iRestaurant;
import org.springframework.data.repository.PagingAndSortingRepository;
import javax.transaction.Transactional;



/**
 *
 * @author aaauabat
 */
public interface iRestaurantRepository extends PagingAndSortingRepository<iRestaurant, Long> {
    public iRestaurant findById(Long id);
    @Transactional
    Long deleteById(Long id);
   
    
}

