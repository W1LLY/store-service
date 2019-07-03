/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.storeservice.controller;

import edu.umss.storeservice.dto.EmployeeDto;
import edu.umss.storeservice.model.Employee;
import edu.umss.storeservice.service.EmployeeService;
import edu.umss.storeservice.service.GenericService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController extends GenericController<Employee, EmployeeDto> {
    private EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @Override
    protected GenericService getService() {
        return service;
    }
}