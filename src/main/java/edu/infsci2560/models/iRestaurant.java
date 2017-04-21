package edu.infsci2560.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import javax.persistence.Id;
//import javax.persistence.ElementCollection;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.List;
/**
 *
 * @author aaabuabat
 */
@Entity

public class iRestaurant {
   // private static final long serialVersionUID = 1L;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    protected String title;
    protected CuisineType cuisineType;
    protected MealTime mealTime;
    protected MealType mealType;
    protected String description;
      
    @OneToMany(targetEntity=KitchenKit.class, mappedBy="irestaurant", cascade=CascadeType.ALL)
    protected List<KitchenKit> kitchenKit;
    @OneToMany(targetEntity=Ingredient.class, mappedBy="irestaurant", cascade=CascadeType.ALL)
    protected List<Ingredient> ingredients;
    @OneToMany(targetEntity=Directions.class, mappedBy="irestaurant", cascade=CascadeType.ALL)
    protected List<Directions> directions;

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

   /* @Override
    public String toString() {
        return "[ id=" + this.id + ", title=" + this.title  + ", CuisineType=" + this.cuisineType + ", MealTime=" + this.mealTime + ", MealType" + this.mealType + ", description" + this.description + ", KitchenKit"+ this.kitchenKit + " ]";
    }*/

    @Override
    public String toString() {
        String result = String.format(
                "iRestaurant[id=%d, title='%s', cuisineType='%s', MealTime='%s', MealType='%d', description='%s']%n",
                this.id, this.title, this.cuisineType, this.mealTime, this.mealType, this.description);
        if (ingredients != null) {
            for(Ingredient ingredient : ingredients) {
                result += String.format(
                        "Ingredient[ id=%d, value='%s', unit='%s', text='%s']%n",
                        ingredient.getId(), ingredient.getValue(), ingredient.getUnit(), ingredient.getText());
            }
        }
              
        if (directions != null) {
            for(Directions direction : directions) {
                result += String.format(
                        "Directions[ id=%d, text='%s']%n",
                        direction.getId(), direction.getText());
            }
        }
        if (kitchenKit != null) {
            for(KitchenKit kitchenKits : kitchenKit) {
                result += String.format(
                        "KitchenKit[ id=%d, text='%s']%n",
                        kitchenKits.getId(), kitchenKits.getText());
            }
        }
        
        return result;
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
    
   
    
    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
 /**
     * @return the name
     */
    public  List<Directions> getDirections() {
        return directions;
    }

    /** 
     * @param kitchenKit the name to set
     */
    public void setDirections(List<Directions> directions) {
        this.directions = directions;
    }
    
      /**
     * @return the name
     */
    public  List<KitchenKit> getKitchenKit() {
        return kitchenKit;
    }

    /** 
     * @param kitchenKit the name to set
     */
    public void setKitchenKit(List<KitchenKit> kitchenKit) {
        this.kitchenKit = kitchenKit;
    }
}
