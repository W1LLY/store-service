package edu.umss.storeservice.controller;

import edu.umss.storeservice.dto.FeatureInstanceDto;
import edu.umss.storeservice.model.FeatureInstance;
import edu.umss.storeservice.service.FeatureInstanceService;
import edu.umss.storeservice.service.GenericService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Juan Montaño
 */
@RestController
@RequestMapping("/featureinstances")
public class FeatureInstanceController extends GenericController<FeatureInstance, FeatureInstanceDto> {
    private FeatureInstanceService service;

    public FeatureInstanceController(FeatureInstanceService service) {
        this.service = service;
    }

    @Override
    protected GenericService getService() {
        return service;
    }
}
