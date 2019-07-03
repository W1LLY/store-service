/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.storeservice.service;

import edu.umss.storeservice.model.Sale;
import edu.umss.storeservice.repository.GenericRepository;
import edu.umss.storeservice.repository.SaleRepository;
import org.springframework.stereotype.Service;

@Service
public class SaleServiceImpl extends GenericServiceImpl<Sale> implements SaleService {
    private final SaleRepository repository;

    public SaleServiceImpl(SaleRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Sale> getRepository() {
        return repository;
    }
}
