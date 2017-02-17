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
        None,
        Mediterranean ,
        Indian ,
        Ozbki , 
        Westren , 
        Chinese 
        
    
}
 public enum MealTime {
        None,
        Breakfast ,
        Brunch ,
        Lunch , 
        Dinner , 
        Supper 
        
}
public enum MealType {
        None,
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
    protected String description;
    protected CuisineType CuisineType;
    protected MealTime MealTime;
    protected MealType MealType;


    public iRestaurant() {
        this.id          = Long.MAX_VALUE;
        this.title       = null;
        this.description = null;
        this.CuisineType = null;
        this.MealTime    = null;
        this.MealType    = null; 
    }

    public iRestaurant(Long id, String title, String description, CuisineType CuisineType, MealTime MealTime, MealType MealType) {
        this.id          = id;
        this.title       = title;
        this.description = description;
        this.CuisineType = CuisineType;
        this.MealTime    = MealTime;
        this.MealType    = MealType;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", title=" + this.title + ", description" + this.description + ", CuisineType=" + this.CuisineType + ", MealTime=" + this.MealTime + ", MealType" + this.MealType + " ]";
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



    /**
     * @return the CuisineType
     */
    public CuisineType getCuisineType() {
        return CuisineType;
    }

    /**
     * @param CuisineType the CuisineType to set
     */
    public void setCuisineType(CuisineType CuisineType) {
        this.CuisineType = CuisineType;
    }
    
        /**
     * @return the MealTime
     */
    public MealTime getMealTime() {
        return MealTime;
    }

    /**
     * @param MealTime the MealTime to set
     */
    public void setMealTime(MealTime MealTime) {
        this.MealTime = MealTime;
    }
    
        /**
     * @return the MealType
     */
    public MealType getMealType() {
        return MealType;
    }

    /**
     * @param MealType the MealType to set
     */
    public void setMealType(MealType MealType) {
        this.MealType = MealType;
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

}
