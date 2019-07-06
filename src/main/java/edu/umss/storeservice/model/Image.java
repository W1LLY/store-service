package edu.umss.storeservice.model;

import edu.umss.storeservice.dto.ImageDto;

import javax.persistence.*;

/**
 * @author Juan Montaño
 */
@Entity
public class Image extends ModelBase<ImageDto> {

    @Basic(fetch = FetchType.EAGER)
    @Lob
    private Byte[] image;

    @ManyToOne
    private Item item;


    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
