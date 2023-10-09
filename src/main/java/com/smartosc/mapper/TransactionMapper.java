package com.smartosc.mapper;

import com.smartosc.entity.Transaction;
import com.smartosc.entity.TransactionExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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