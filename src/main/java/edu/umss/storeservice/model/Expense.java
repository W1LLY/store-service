/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.storeservice.model;

import edu.umss.storeservice.dto.ExpenseDto;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Expense extends ModelBase<ExpenseDto> {
    @OneToMany
    private Set<ExpenseType> expenseType;
    private Long value;
    private String description;

    @ManyToOne
    private ItemInstance itemInstance;

    public Set<ExpenseType> getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(Set<ExpenseType> expenseType) {
        this.expenseType = expenseType;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ItemInstance getItemInstance() {
        return itemInstance;
    }

    public void setItemInstance(ItemInstance itemInstance) {
        this.itemInstance = itemInstance;
    }
}