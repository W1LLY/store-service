package edu.umss.storeservice.service;

import edu.umss.storeservice.model.Image;
import edu.umss.storeservice.repository.GenericRepository;
import edu.umss.storeservice.repository.ImageRepository;
import org.springframework.stereotype.Service;

/**
 * @author Willy Kelvis Sanchez Rojas
 */
@Service
public class ImageServiceImpl extends GenericServiceImpl<Image> implements ImageService {
    private final ImageRepository repository;

    public ImageServiceImpl(ImageRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Image> getRepository() {
        return repository;
    }
}
