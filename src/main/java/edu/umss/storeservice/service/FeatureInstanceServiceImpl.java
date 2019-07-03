/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.storeservice.service;

import edu.umss.storeservice.model.FeatureInstance;
import edu.umss.storeservice.repository.FeatureInstanceRepository;
import edu.umss.storeservice.repository.GenericRepository;
import org.springframework.stereotype.Service;

@Service
public class FeatureInstanceServiceImpl extends GenericServiceImpl<FeatureInstance> implements FeatureInstanceService {
    private final FeatureInstanceRepository repository;

    public FeatureInstanceServiceImpl(FeatureInstanceRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<FeatureInstance> getRepository() {
        return repository;
    }
}
