/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.storeservice.service;

import edu.umss.storeservice.model.SubCategory;
import edu.umss.storeservice.repository.GenericRepository;
import edu.umss.storeservice.repository.SubCategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class SubCategoryServiceImpl extends GenericServiceImpl<SubCategory> implements SubCategoryService {
    private final SubCategoryRepository repository;

    public SubCategoryServiceImpl(SubCategoryRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<SubCategory> getRepository() {
        return repository;
    }
}
