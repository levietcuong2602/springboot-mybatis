package com.smartosc.datasource.entity;

//import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Block implements Serializable {
    private Long id;

    private Object hash;

    private Object epochNo;

    private Object slotNo;

    private Object epochSlotNo;

    private Object blockNo;

    private Long previousId;

    private Long slotLeaderId;

    private Object size;

    private Date time;

    private Long txCount;

    private Object protoMajor;

    private Object protoMinor;

    private String vrfKey;

    private Object opCert;

    private Object opCertCounter;

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

    public Object getEpochNo() {
        return epochNo;
    }

    public void setEpochNo(Object epochNo) {
        this.epochNo = epochNo;
    }

    public Object getSlotNo() {
        return slotNo;
    }

    public void setSlotNo(Object slotNo) {
        this.slotNo = slotNo;
    }

    public Object getEpochSlotNo() {
        return epochSlotNo;
    }

    public void setEpochSlotNo(Object epochSlotNo) {
        this.epochSlotNo = epochSlotNo;
    }

    public Object getBlockNo() {
        return blockNo;
    }

    public void setBlockNo(Object blockNo) {
        this.blockNo = blockNo;
    }

    public Long getPreviousId() {
        return previousId;
    }

    public void setPreviousId(Long previousId) {
        this.previousId = previousId;
    }

    public Long getSlotLeaderId() {
        return slotLeaderId;
    }

    public void setSlotLeaderId(Long slotLeaderId) {
        this.slotLeaderId = slotLeaderId;
    }

    public Object getSize() {
        return size;
    }

    public void setSize(Object size) {
        this.size = size;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Long getTxCount() {
        return txCount;
    }

    public void setTxCount(Long txCount) {
        this.txCount = txCount;
    }

    public Object getProtoMajor() {
        return protoMajor;
    }

    public void setProtoMajor(Object protoMajor) {
        this.protoMajor = protoMajor;
    }

    public Object getProtoMinor() {
        return protoMinor;
    }

    public void setProtoMinor(Object protoMinor) {
        this.protoMinor = protoMinor;
    }

    public String getVrfKey() {
        return vrfKey;
    }

    public void setVrfKey(String vrfKey) {
        this.vrfKey = vrfKey == null ? null : vrfKey.trim();
    }

    public Object getOpCert() {
        return opCert;
    }

    public void setOpCert(Object opCert) {
        this.opCert = opCert;
    }

    public Object getOpCertCounter() {
        return opCertCounter;
    }

    public void setOpCertCounter(Object opCertCounter) {
        this.opCertCounter = opCertCounter;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", hash=").append(hash);
        sb.append(", epochNo=").append(epochNo);
        sb.append(", slotNo=").append(slotNo);
        sb.append(", epochSlotNo=").append(epochSlotNo);
        sb.append(", blockNo=").append(blockNo);
        sb.append(", previousId=").append(previousId);
        sb.append(", slotLeaderId=").append(slotLeaderId);
        sb.append(", size=").append(size);
        sb.append(", time=").append(time);
        sb.append(", txCount=").append(txCount);
        sb.append(", protoMajor=").append(protoMajor);
        sb.append(", protoMinor=").append(protoMinor);
        sb.append(", vrfKey=").append(vrfKey);
        sb.append(", opCert=").append(opCert);
        sb.append(", opCertCounter=").append(opCertCounter);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}