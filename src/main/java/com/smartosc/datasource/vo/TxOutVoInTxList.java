package com.smartosc.datasource.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TxOutVoInTxList {
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
}
