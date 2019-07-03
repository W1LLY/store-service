/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.storeservice.dto;

import edu.umss.storeservice.model.Buy;

import java.math.BigDecimal;

public class BuyDto extends DtoBase<Buy> {
    private BigDecimal value;

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
