package edu.umss.storeservice.controller;

import edu.umss.storeservice.dto.FeatureDto;
import edu.umss.storeservice.model.Feature;
import edu.umss.storeservice.service.FeatureService;
import edu.umss.storeservice.service.GenericService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Juan Montaño
 */
@RestController
@RequestMapping("/features")
public class FeatureController extends GenericController<Feature, FeatureDto> {

    private FeatureService service;

    public FeatureController(FeatureService service) {
        this.service = service;
    }

    @Override
    protected GenericService getService() {
        return service;
    }
}
