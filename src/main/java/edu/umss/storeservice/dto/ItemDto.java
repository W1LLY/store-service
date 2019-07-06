/**
 * (C) 2017 Agilysys NV, LLC.  All Rights Reserved.  Confidential Information of Agilysys NV, LLC.
 */
package edu.umss.storeservice.dto;

import edu.umss.storeservice.model.Image;
import edu.umss.storeservice.model.Item;
import org.modelmapper.ModelMapper;

public class ItemDto extends DtoBase<Item> {

    private String name;
    private String code;
    private String label;

    private String category;
    private Long subCategoryId;
    private String price;
    private Object[] comments = new Object[0];
    private Long id;
    private String description;
    private Boolean featured;
    private Object[] image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object[] getImage() {
        return image;
    }

    public void setImage(Object[] image) {
        this.image = image;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Object[] getComments() {
        return comments;
    }

    public void setComments(Object[] comments) {
        this.comments = comments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getFeatured() {
        return featured;
    }

    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Long getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(Long subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public ItemDto toDto(Item item, ModelMapper mapper) {
        super.toDto(item, mapper);
        setCategory(item.getSubCategory().getCategory().getName());
        setLabel(item.getName());
        if (item.getImage() != null || item.getImage().size() > 0) {
            for (Image image : item.getImage()) {
                Long[] images = new Long[item.getImage().size()];
                //byte[] bytes = new byte[image.getImage().length];
                for (int i = 0; i < images.length; i++) {
                    images[i] = image.getId();
                    //bytes[i] = image.getImage()[i];
                }
                setImage(images);
                //String imageStr = Base64.encodeBase64String(bytes);
                //setImage(imageStr);
            }
        }
        setPrice("5");
        return this;
    }

}
