package edu.umss.storeservice.dto;

import edu.umss.storeservice.model.Image;

/**
 * @author Willy Kelvis Sanchez Rojas
 */
public class ImageDto extends DtoBase<Image> {

    private String name;

    private Byte[] image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }
}
