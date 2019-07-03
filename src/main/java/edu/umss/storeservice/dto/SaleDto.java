/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.storeservice.dto;

import edu.umss.storeservice.model.Sale;
import org.modelmapper.ModelMapper;

import java.util.Date;

public class SaleDto extends DtoBase<Sale> {
    private Long employeeId;
    private Date date;
    private String description;

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public DtoBase toDto(Sale element, ModelMapper mapper) {
        super.toDto(element, mapper);
        setEmployeeId(element.getEmployee().getId());
        return this;
    }
}