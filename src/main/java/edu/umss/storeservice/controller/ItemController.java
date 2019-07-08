/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.storeservice.controller;

import edu.umss.storeservice.dto.ItemDto;
import edu.umss.storeservice.model.Item;
import edu.umss.storeservice.service.GenericService;
import edu.umss.storeservice.service.ItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/items")
public class ItemController extends GenericController<Item, ItemDto> {
    private ItemService service;

    public ItemController(ItemService service) {
        this.service = service;
    }

    @Override
    protected GenericService getService() {
        return service;
    }


    @RequestMapping(
            value = "/{id}/image",
            method = RequestMethod.POST,
            consumes = "multipart/form-data"
    )
    @Override
    public ResponseEntity uploadImage(@RequestParam("uploadingFiles") MultipartFile uploadedFile,
                                      @PathVariable("id") Long id) throws IOException {
        System.out.println("****** " + uploadedFile + " " + id);
        return super.uploadImage(uploadedFile, id);
    }
}