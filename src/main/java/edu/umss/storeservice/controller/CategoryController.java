/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.storeservice.controller;

import edu.umss.storeservice.dto.CategoryDto;
import edu.umss.storeservice.model.Category;
import edu.umss.storeservice.service.CategoryService;
import edu.umss.storeservice.service.GenericService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
public class CategoryController extends GenericController<Category, CategoryDto> {
    private CategoryService service;

    public CategoryController(CategoryService service) {
        this.service = service;
    }

    @Override
    protected GenericService getService() {
        return service;
    }
}