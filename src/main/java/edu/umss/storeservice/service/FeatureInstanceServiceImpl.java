/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.storeservice.service;

import edu.umss.storeservice.model.Feature;
import edu.umss.storeservice.model.FeatureInstance;
import edu.umss.storeservice.repository.FeatureInstanceRepository;
import edu.umss.storeservice.repository.GenericRepository;
import org.springframework.stereotype.Service;

@Service
public class FeatureInstanceServiceImpl extends GenericServiceImpl<FeatureInstance> implements FeatureInstanceService {
    private final FeatureInstanceRepository repository;

    private FeatureService featureService;

    public FeatureInstanceServiceImpl(FeatureInstanceRepository repository, FeatureService featureService) {
        this.repository = repository;
        this.featureService = featureService;
    }

    @Override
    protected GenericRepository<FeatureInstance> getRepository() {
        return repository;
    }

    @Override
    protected void validateSave(FeatureInstance model) {
        //super.validateSave(model);
        Feature feature = new Feature();
        feature.setName(model.getFeature().getName());
        feature = featureService.save(feature);

        model.setFeature(feature);


    }
}
