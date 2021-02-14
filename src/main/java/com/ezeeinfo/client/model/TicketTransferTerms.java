package com.ezeeinfo.client.model;

public class TicketTransferTerms {

    private Integer chargeAmount;
    private String chargeType;
    private Integer transferable;

    public Integer getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(Integer chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public Integer getTransferable() {
        return transferable;
    }

    public void setTransferable(Integer transferable) {
        this.transferable = transferable;
    }
}
