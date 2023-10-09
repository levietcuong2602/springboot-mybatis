package com.smartosc.datasource.vo;

import com.smartosc.datasource.entity.TxOut;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;

@Getter
@Setter
public class TransactionVo4List {
    private Long id;

    private String hash;

    private Object blockIndex;

    private Object outSum;

    private Object fee;

    private Long deposit;

    private Object size;

    private Object invalidBefore;

    private Object invalidHereafter;

    private Boolean validContract;

    private Object scriptSize;

    private BlockVo block;

    private Collection<TxOutVoInTxList> txOuts;
}
