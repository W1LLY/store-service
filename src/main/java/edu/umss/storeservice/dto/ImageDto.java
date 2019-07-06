package edu.umss.storeservice.dto;

import edu.umss.storeservice.model.Image;
import org.apache.tomcat.util.codec.binary.Base64;
import org.modelmapper.ModelMapper;

/**
 * @author Juan Montaño
 */
public class ImageDto extends DtoBase<Image> {

    private String image;
    private Long itemId;

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

    @Override
    public ImageDto toDto(Image element, ModelMapper mapper) {
        super.toDto(element, mapper);
        setItemId(element.getItem().getId());
        if (element.getImage() != null) {
            byte[] bytes = new byte[element.getImage().length];
            for (int i = 0; i < element.getImage().length; i++) {
                bytes[i] = element.getImage()[i];
            }
            String imageStr = Base64.encodeBase64String(bytes);
            setImage(imageStr);
        }
        return this;
    }
}
