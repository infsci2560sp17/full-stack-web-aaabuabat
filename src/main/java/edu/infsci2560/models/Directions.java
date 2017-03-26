package edu.infsci2560.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *
 * @author aaabuabat
 */
@Entity

public class Directions {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String text;    // list of the Kitchen Kit that have been used in this meal. 
    


    @ManyToOne
    protected iRestaurant irestaurant;
    
    public Directions() {

    }
    
     public Directions(String text,iRestaurant irestaurant )
     {
         this.text=text;
         this.irestaurant=irestaurant;
     }
     
      @Override
    public String toString() {
        return "[ id=" + this.id + ", text=" + this.text + " ]";
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
    public String getText() {
        return text;
    }

    /**
     * @param text the name to set
     */
    public void setText(String text) {
        this.text = text;
   }
   
    public iRestaurant getIRestaurant() {
        return irestaurant;
    }

    public void setIRestaurant(iRestaurant irestaurant) {
        this.irestaurant = irestaurant;
    }
}
 
  
  

