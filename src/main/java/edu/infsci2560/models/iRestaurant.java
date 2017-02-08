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
        Mediterranean ,
        Indian ,
        Ozbki , 
        Westren , 
        chinese 
        
    
}

  @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String title;
    protected CuisineType CuisineType;

    public iRestaurant() {
        this.id = Long.MAX_VALUE;
        this.title = null;
        this.CuisineType = CuisineType.Indian;
    }

    public iRestaurant(Long id, String name, CuisineType CuisineType) {
        this.id = id;
        this.title = name;
        this.CuisineType = CuisineType;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", title=" + this.title + ", CuisineType=" + this.CuisineType + " ]";
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
