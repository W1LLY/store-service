package edu.umss.storeservice.dto;

import edu.umss.storeservice.model.Feature;

/**
 * @author Juan Montaño
 */
public class FeatureDto extends DtoBase<Feature> {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
