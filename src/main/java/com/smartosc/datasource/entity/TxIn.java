package com.smartosc.datasource.entity;

//import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class TxIn implements Serializable {
    private Long id;

    private Long txInId;

    private Long txOutId;

    private Object txOutIndex;

    private Long redeemerId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTxInId() {
        return txInId;
    }

    public void setTxInId(Long txInId) {
        this.txInId = txInId;
    }

    public Long getTxOutId() {
        return txOutId;
    }

    public void setTxOutId(Long txOutId) {
        this.txOutId = txOutId;
    }

    public Object getTxOutIndex() {
        return txOutIndex;
    }

    public void setTxOutIndex(Object txOutIndex) {
        this.txOutIndex = txOutIndex;
    }

    public Long getRedeemerId() {
        return redeemerId;
    }

    public void setRedeemerId(Long redeemerId) {
        this.redeemerId = redeemerId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", txInId=").append(txInId);
        sb.append(", txOutId=").append(txOutId);
        sb.append(", txOutIndex=").append(txOutIndex);
        sb.append(", redeemerId=").append(redeemerId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}