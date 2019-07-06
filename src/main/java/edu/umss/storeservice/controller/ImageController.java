package edu.umss.storeservice.controller;

import edu.umss.storeservice.dto.ImageDto;
import edu.umss.storeservice.model.Image;
import edu.umss.storeservice.service.GenericService;
import edu.umss.storeservice.service.ImageService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author Juan Montaño
 */

@RestController
@RequestMapping("/images")
public class ImageController extends GenericController<Image, ImageDto> {

    private ImageService service;

    public ImageController(ImageService service) {
        this.service = service;
    }


    @Override
    protected GenericService getService() {
        return service;
    }

    @PostMapping(value = "/{id}/image", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    @Override
    public ResponseEntity uploadImage(@RequestParam("file") MultipartFile file,
                                      @PathVariable("id") Long id) throws IOException {
        logger.info("file:" + file.toString());
        return super.uploadImage(file, id);
    }
}
