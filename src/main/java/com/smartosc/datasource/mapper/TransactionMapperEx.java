package com.smartosc.datasource.mapper;

import com.smartosc.datasource.entity.Block;
import com.smartosc.datasource.vo.TransactionVo4List;
import com.smartosc.datasource.vo.TxOutVoInTxList;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

public interface TransactionMapperEx {
    List<TransactionVo4List> selectByCondition(
            @Param("offset") Integer offset,
            @Param("limit") Integer rows);

    Block selectBlockByTxId(@Param("blockId") Long blockId);

    Collection<TxOutVoInTxList> selectTxOutsByTxId(@Param("txId") Long txId);
}
