package edu.umss.storeservice.model;

import edu.umss.storeservice.dto.ImagenInstanceDto;
import org.modelmapper.ModelMapper;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 * @author Juan Montaño
 */
@Entity
public class ImageInstance extends ModelBase<ImagenInstanceDto> {

    @OneToOne
    private Image image;

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    @Override
    public ModelBase toDomain(ImagenInstanceDto element, ModelMapper mapper) {
        super.toDomain(element, mapper);
        setImage((Image) new Image().toDomain(element.getImageDto(), mapper));
        return this;
    }
}
