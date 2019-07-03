/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.storeservice.service;

import edu.umss.storeservice.model.Item;
import edu.umss.storeservice.repository.GenericRepository;
import edu.umss.storeservice.repository.ItemRepository;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl extends GenericServiceImpl<Item> implements ItemService {
    private final ItemRepository repository;

    public ItemServiceImpl(ItemRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Item> getRepository() {
        return repository;
    }

    @Override
    public void setImage(Item itemPersisted, Byte[] bytes) {
        itemPersisted.setImage(bytes);
    }
}
