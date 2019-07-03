package edu.umss.storeservice.dto;

import edu.umss.storeservice.model.ExpenseType;

/**
 * @author Willy Kelvis Sanchez Rojas
 */
public class ExpenseTypeDto extends DtoBase<ExpenseType>{

    private String typeName;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
