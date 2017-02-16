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
    protected CuisineType CuisineType;
    protected MealTime MealTime;
    protected MealType MealType;


    public iRestaurant() {
        this.id          = Long.MAX_VALUE;
        this.title       = null;
        this.CuisineType = CuisineType.None;
        this.MealTime    = MealTime.None;
        this.MealType    = MealType.None; 
    }

    public iRestaurant(Long id, String title, CuisineType CuisineType, MealTime MealTime, MealType MealType) {
        this.id          = id;
        this.title       = title;
        this.CuisineType = CuisineType;
        this.MealTime    = MealTime;
        this.MealType    = MealType;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", title=" + this.title + ", CuisineType=" + this.CuisineType + ", MealTime=" + this.MealTime + ", MealType" + this.MealType + " ]";
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
