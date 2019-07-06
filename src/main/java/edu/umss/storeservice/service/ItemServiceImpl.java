/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.storeservice.service;

import edu.umss.storeservice.model.Item;
import edu.umss.storeservice.repository.GenericRepository;
import edu.umss.storeservice.repository.ImageRepository;
import edu.umss.storeservice.repository.ItemRepository;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl extends GenericServiceImpl<Item> implements ItemService {
    private final ItemRepository repository;

    private final ImageRepository imageRepository;

    public ItemServiceImpl(ItemRepository repository, ImageRepository imageRepository) {
        this.repository = repository;
        this.imageRepository = imageRepository;
    }

    @Override
    protected GenericRepository<Item> getRepository() {
        return repository;
    }

    @Override
    public void setImage(Item model) {
        imageRepository.saveAll(model.getImage());
        repository.save(model);
    }

}
