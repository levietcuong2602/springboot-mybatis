package com.smartosc.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Transaction implements Serializable {
    private Long id;

    private Object hash;

    private Long blockId;

    private Object blockIndex;

    private Object outSum;

    private Object fee;

    private Long deposit;

    private Object size;

    private Object invalidBefore;

    private Object invalidHereafter;

    private Boolean validContract;

    private Object scriptSize;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Object getHash() {
        return hash;
    }

    public void setHash(Object hash) {
        this.hash = hash;
    }

    public Long getBlockId() {
        return blockId;
    }

    public void setBlockId(Long blockId) {
        this.blockId = blockId;
    }

    public Object getBlockIndex() {
        return blockIndex;
    }

    public void setBlockIndex(Object blockIndex) {
        this.blockIndex = blockIndex;
    }

    public Object getOutSum() {
        return outSum;
    }

    public void setOutSum(Object outSum) {
        this.outSum = outSum;
    }

    public Object getFee() {
        return fee;
    }

    public void setFee(Object fee) {
        this.fee = fee;
    }

    public Long getDeposit() {
        return deposit;
    }

    public void setDeposit(Long deposit) {
        this.deposit = deposit;
    }

    public Object getSize() {
        return size;
    }

    public void setSize(Object size) {
        this.size = size;
    }

    public Object getInvalidBefore() {
        return invalidBefore;
    }

    public void setInvalidBefore(Object invalidBefore) {
        this.invalidBefore = invalidBefore;
    }

    public Object getInvalidHereafter() {
        return invalidHereafter;
    }

    public void setInvalidHereafter(Object invalidHereafter) {
        this.invalidHereafter = invalidHereafter;
    }

    public Boolean getValidContract() {
        return validContract;
    }

    public void setValidContract(Boolean validContract) {
        this.validContract = validContract;
    }

    public Object getScriptSize() {
        return scriptSize;
    }

    public void setScriptSize(Object scriptSize) {
        this.scriptSize = scriptSize;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", hash=").append(hash);
        sb.append(", blockId=").append(blockId);
        sb.append(", blockIndex=").append(blockIndex);
        sb.append(", outSum=").append(outSum);
        sb.append(", fee=").append(fee);
        sb.append(", deposit=").append(deposit);
        sb.append(", size=").append(size);
        sb.append(", invalidBefore=").append(invalidBefore);
        sb.append(", invalidHereafter=").append(invalidHereafter);
        sb.append(", validContract=").append(validContract);
        sb.append(", scriptSize=").append(scriptSize);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}