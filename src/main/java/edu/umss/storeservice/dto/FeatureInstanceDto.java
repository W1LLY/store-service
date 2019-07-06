package edu.umss.storeservice.dto;

import edu.umss.storeservice.model.FeatureInstance;
import org.modelmapper.ModelMapper;

/**
 * @author Juan Montaño
 */
public class FeatureInstanceDto extends DtoBase<FeatureInstance> {
    private String name;
    private String value;

    private FeatureDto featureDto;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public FeatureDto getFeatureDto() {
        return featureDto;
    }

    public void setFeatureDto(FeatureDto featureDto) {
        this.featureDto = featureDto;
    }

    @Override
    public DtoBase toDto(FeatureInstance element, ModelMapper mapper) {
        super.toDto(element, mapper);
        mapper.map(element.getFeature(), this);
        // copy item to itemdto
        setFeatureDto((new FeatureDto().toDto(element.getFeature(), mapper)));
        return this;
    }
}
