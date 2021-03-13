package com.ezeeinfo.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TicketTransferTerms {

    private final Integer chargeAmount;
    private final String chargeType;
    private final Integer transferable;
    @JsonCreator
    public TicketTransferTerms(@JsonProperty("chargeAmount") Integer chargeAmount, @JsonProperty("chargeType") String chargeType,
                               @JsonProperty("transferable") Integer transferable) {
        this.chargeAmount = chargeAmount;
        this.chargeType = chargeType;
        this.transferable = transferable;
    }

    public Integer getChargeAmount() {
        return chargeAmount;
    }

    public String getChargeType() {
        return chargeType;
    }

    public Integer getTransferable() {
        return transferable;
    }
}
