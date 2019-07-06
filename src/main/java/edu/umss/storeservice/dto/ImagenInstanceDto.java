package edu.umss.storeservice.dto;

import edu.umss.storeservice.model.ImageInstance;
import org.modelmapper.ModelMapper;

/**
 * @author Juan Montaño
 */
public class ImagenInstanceDto extends DtoBase<ImageInstance> {

    private String image;
    private Long itemId;
    private ImageDto imageDto;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public void setImageDto(ImageDto imageDto) {
        this.imageDto = imageDto;
    }

    public ImageDto getImageDto() {
        return imageDto;
    }

    @Override
    public DtoBase toDto(ImageInstance element, ModelMapper mapper) {
        super.toDto(element, mapper);
        mapper.map(element.getImage(), this);
        // copy item to itemdto
        setImageDto(new ImageDto().toDto(element.getImage(), mapper));
        return this;
    }
}
