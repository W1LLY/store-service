/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.storeservice.service;

import edu.umss.storeservice.model.Contract;
import edu.umss.storeservice.repository.ContractRepository;
import edu.umss.storeservice.repository.GenericRepository;
import org.springframework.stereotype.Service;

@Service
public class ContractServiceImpl extends GenericServiceImpl<Contract> implements ContractService {
    private final ContractRepository repository;

    public ContractServiceImpl(ContractRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Contract> getRepository() {
        return repository;
    }
}
