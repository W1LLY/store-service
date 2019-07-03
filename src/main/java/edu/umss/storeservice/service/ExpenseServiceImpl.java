/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.storeservice.service;

import edu.umss.storeservice.model.Expense;
import edu.umss.storeservice.repository.ExpenseRepository;
import edu.umss.storeservice.repository.GenericRepository;
import org.springframework.stereotype.Service;

@Service
public class ExpenseServiceImpl extends GenericServiceImpl<Expense> implements ExpenseService {
    private final ExpenseRepository repository;

    public ExpenseServiceImpl(ExpenseRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Expense> getRepository() {
        return repository;
    }
}
