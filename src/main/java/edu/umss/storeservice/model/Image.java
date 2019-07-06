package edu.umss.storeservice.model;

import edu.umss.storeservice.dto.ImageDto;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

/**
 * @author Willy Kelvis Sanchez Rojas
 */
@Entity
public class Image extends ModelBase<ImageDto> {

    private String name;

    @Lob
    private byte[] image;

    @ManyToOne
    private Item item;

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
