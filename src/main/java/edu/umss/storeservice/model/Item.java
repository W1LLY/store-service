/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.storeservice.model;

import edu.umss.storeservice.dto.ItemDto;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Set;

@Entity
public class Item extends ModelBase<ItemDto> {
    private String name;
    private String code;
    private String brand;
    private String year;
    //todo crear modelo unidad
    private String capacityUnit;
    private Integer capacityValue;
    private String description;
    // todo crear una entidad inventory con item y quantity

    @OneToMany
    private Set<FeatureInstance> featureInstances;

    //todo mover a otra entidad para soportar muchas imagenes
    @Lob
    private Byte[] image;

    @OneToOne(targetEntity = SubCategory.class)
    private SubCategory subCategory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }

    public SubCategory getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(SubCategory subCategory) {
        this.subCategory = subCategory;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Set<FeatureInstance> getFeatureInstances() {
        return featureInstances;
    }

    public void setFeatureInstances(Set<FeatureInstance> featureInstances) {
        this.featureInstances = featureInstances;
    }

    public String getCapacityUnit() {
        return capacityUnit;
    }

    public void setCapacityUnit(String capacityUnit) {
        this.capacityUnit = capacityUnit;
    }

    public Integer getCapacityValue() {
        return capacityValue;
    }

    public void setCapacityValue(Integer capacityValue) {
        this.capacityValue = capacityValue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
