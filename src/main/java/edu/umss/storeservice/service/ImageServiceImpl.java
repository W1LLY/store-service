package edu.umss.storeservice.service;

import edu.umss.storeservice.model.Image;
import edu.umss.storeservice.repository.GenericRepository;
import edu.umss.storeservice.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Juan Montaño
 */
@Service
public class ImageServiceImpl extends GenericServiceImpl<Image> implements ImageService {

    @Autowired
    ItemService itemService;

    private final ImageRepository repository;

    public ImageServiceImpl(ImageRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Image> getRepository() {
        return repository;
    }

    @Override
    public void setImage(Image itemPersisted, Byte[] bytes) {
        itemPersisted.setImage(bytes);
    }
}
