package com.smartosc.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class TxOut implements Serializable {
    private Long id;

    private Long txId;

    private Object index;

    private String address;

    private Boolean addressHasScript;

    private Object paymentCred;

    private Long stakeAddressId;

    private Object value;

    private Object dataHash;

    private Long inlineDatumId;

    private Long referenceScriptId;

    private byte[] addressRaw;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTxId() {
        return txId;
    }

    public void setTxId(Long txId) {
        this.txId = txId;
    }

    public Object getIndex() {
        return index;
    }

    public void setIndex(Object index) {
        this.index = index;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Boolean getAddressHasScript() {
        return addressHasScript;
    }

    public void setAddressHasScript(Boolean addressHasScript) {
        this.addressHasScript = addressHasScript;
    }

    public Object getPaymentCred() {
        return paymentCred;
    }

    public void setPaymentCred(Object paymentCred) {
        this.paymentCred = paymentCred;
    }

    public Long getStakeAddressId() {
        return stakeAddressId;
    }

    public void setStakeAddressId(Long stakeAddressId) {
        this.stakeAddressId = stakeAddressId;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getDataHash() {
        return dataHash;
    }

    public void setDataHash(Object dataHash) {
        this.dataHash = dataHash;
    }

    public Long getInlineDatumId() {
        return inlineDatumId;
    }

    public void setInlineDatumId(Long inlineDatumId) {
        this.inlineDatumId = inlineDatumId;
    }

    public Long getReferenceScriptId() {
        return referenceScriptId;
    }

    public void setReferenceScriptId(Long referenceScriptId) {
        this.referenceScriptId = referenceScriptId;
    }

    public byte[] getAddressRaw() {
        return addressRaw;
    }

    public void setAddressRaw(byte[] addressRaw) {
        this.addressRaw = addressRaw;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", txId=").append(txId);
        sb.append(", index=").append(index);
        sb.append(", address=").append(address);
        sb.append(", addressHasScript=").append(addressHasScript);
        sb.append(", paymentCred=").append(paymentCred);
        sb.append(", stakeAddressId=").append(stakeAddressId);
        sb.append(", value=").append(value);
        sb.append(", dataHash=").append(dataHash);
        sb.append(", inlineDatumId=").append(inlineDatumId);
        sb.append(", referenceScriptId=").append(referenceScriptId);
        sb.append(", addressRaw=").append(addressRaw);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}