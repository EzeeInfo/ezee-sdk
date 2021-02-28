package com.ezeeinfo.model;

public class TicketTransferTerms {

    private final Integer chargeAmount;
    private final String chargeType;
    private final Integer transferable;

    public TicketTransferTerms(Integer chargeAmount, String chargeType, Integer transferable) {
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
