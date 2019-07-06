/**
 * (C) 2017 Agilysys NV, LLC.  All Rights Reserved.  Confidential Information of Agilysys NV, LLC.
 */
package edu.umss.storeservice.dto;

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
    private Object[] images;
    private Object[] featureInstances;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Object[] getImages() {
        return images;
    }

    public void setImages(Object[] images) {
        this.images = images;
    }

    public Object[] getFeatureInstances() {
        return featureInstances;
    }

    public void setFeatureInstances(Object[] featureInstances) {
        this.featureInstances = featureInstances;
    }

    @Override
    public ItemDto toDto(Item item, ModelMapper mapper) {
        super.toDto(item, mapper);
        setCategory(item.getSubCategory().getCategory().getName());
        setLabel(item.getName());
        setPrice("5");
        return this;
    }

}
