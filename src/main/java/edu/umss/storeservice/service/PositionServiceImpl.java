/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.storeservice.service;

import edu.umss.storeservice.model.Position;
import edu.umss.storeservice.repository.GenericRepository;
import edu.umss.storeservice.repository.PositionRepository;
import org.springframework.stereotype.Service;

@Service
public class PositionServiceImpl extends GenericServiceImpl<Position> implements PositionService {
    private final PositionRepository repository;

    public PositionServiceImpl(PositionRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Position> getRepository() {
        return repository;
    }
}
