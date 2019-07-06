package edu.umss.storeservice.dto;

import edu.umss.storeservice.model.Feature;
import org.modelmapper.ModelMapper;

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

    @Override
    public FeatureDto toDto(Feature element, ModelMapper mapper) {
        super.toDto(element, mapper);
        setName(element.getName());
        return this;
    }
}
