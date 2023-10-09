package com.smartosc.datasource.mapper;

import com.smartosc.datasource.entity.Block;
import com.smartosc.datasource.entity.Transaction;
import com.smartosc.datasource.entity.TransactionExample;

import java.util.Collection;
import java.util.List;

import com.smartosc.datasource.vo.TransactionVo4List;
import com.smartosc.datasource.vo.TxOutVoInTxList;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.DependsOn;

public interface TransactionMapper {
    long countByExample(TransactionExample example);

    int deleteByExample(TransactionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Transaction row);

    int insertSelective(Transaction row);

    List<Transaction> selectByExample(TransactionExample example);

    Transaction selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") Transaction row, @Param("example") TransactionExample example);

    int updateByExample(@Param("row") Transaction row, @Param("example") TransactionExample example);

    int updateByPrimaryKeySelective(Transaction row);

    int updateByPrimaryKey(Transaction row);
}