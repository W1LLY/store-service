/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.storeservice.service;

import edu.umss.storeservice.model.Feature;
import edu.umss.storeservice.repository.FeatureRepository;
import edu.umss.storeservice.repository.GenericRepository;
import org.springframework.stereotype.Service;

@Service
public class FeatureServiceImpl extends GenericServiceImpl<Feature> implements FeatureService {
    private final FeatureRepository repository;

    public FeatureServiceImpl(FeatureRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Feature> getRepository() {
        return repository;
    }
}
