package edu.infsci2560.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *
 * @author aaabuabat
 */
@Entity

public class iRestaurant {
      private static final long serialVersionUID = 1L;

    public enum CuisineType {
        Unknown,
        Mediterranean ,
        Indian ,
        Ozbki , 
        Westren , 
        Chinese 
        
    
}
 public enum MealTime {
        Unknown,
        Breakfast ,
        Brunch ,
        Lunch , 
        Dinner , 
        Supper 
        
}
public enum MealType {
        Unknown,
        Appetizer ,
        Salad ,
        Main_Course , 
        Dessert , 
        Beverages 
        
}



  @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String title;
    protected CuisineType cuisineType;
    protected MealTime mealTime;
    protected MealType mealType;
    protected String description;
   


    public iRestaurant() {
        this.id          = Long.MAX_VALUE;
        this.title       = null;
        this.cuisineType = CuisineType.Unknown;
        this.mealTime    = MealTime.Unknown;
        this.mealType    = MealType.Unknown;
        this.description = null;
    }

    public iRestaurant(Long id, String title, CuisineType cuisineType, MealTime mealTime, MealType mealType, String description) {
        this.id          = id;
        this.title       = title;
        this.cuisineType = cuisineType;
        this.mealTime    = mealTime;
        this.mealType    = mealType;
        this.description = description;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", title=" + this.title  + ", CuisineType=" + this.cuisineType + ", MealTime=" + this.mealTime + ", MealType" + this.mealType + ", description" + this.description + " ]";
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * @return the name
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the name to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the CuisineType
     */
    public CuisineType getCuisineType() {
        return cuisineType;
    }

    /**
     * @param CuisineType the CuisineType to set
     */
    public void setCuisineType(CuisineType cuisineType) {
        this.cuisineType = cuisineType;
    }
    
    
        /**
     * @return the MealTime
     */
    public MealTime getMealTime() {
        return mealTime;
    }

    /**
     * @param MealTime the MealTime to set
     */
    public void setMealTime(MealTime mealTime) {
        this.mealTime = mealTime;
    }
    
        /**
     * @return the MealType
     */
    public MealType getMealType() {
        return mealType;
    }

    /**
     * @param MealType the MealType to set
     */
    public void setMealType(MealType mealType) {
        this.mealType = mealType;
    }
    
    

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    
    /**
     * @return the name
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the name to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

}
