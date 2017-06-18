package net.theStol.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Руслан on 18.06.2017.
 */

@Document
public class Restoraunt {

    @Id
   private Long id;
    private String nameRestoraunt;
    private String categoty;
    private String description;

    public Restoraunt(Long id, String nameRestoraunt, String categoty, String description) {
        this.id = id;
        this.nameRestoraunt = nameRestoraunt;
        this.categoty = categoty;
        this.description = description;
    }

    public Restoraunt (){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameRestoraunt() {
        return nameRestoraunt;
    }

    public void setNameRestoraunt(String nameRestoraunt) {
        this.nameRestoraunt = nameRestoraunt;
    }

    public String getCategoty() {
        return categoty;
    }

    public void setCategoty(String categoty) {
        this.categoty = categoty;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
