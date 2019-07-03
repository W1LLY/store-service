/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.storeservice.model;

import edu.umss.storeservice.dto.ExpenseTypeDto;

import javax.persistence.Entity;

@Entity
public class ExpenseType extends ModelBase<ExpenseTypeDto>{

    private String typeName;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
