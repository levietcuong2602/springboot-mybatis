package com.smartosc.datasource.mapper;

import com.smartosc.datasource.entity.TxOut;
import com.smartosc.datasource.entity.TxOutExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TxOutMapper {
    long countByExample(TxOutExample example);

    int deleteByExample(TxOutExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TxOut row);

    int insertSelective(TxOut row);

    List<TxOut> selectByExampleWithBLOBs(TxOutExample example);

    List<TxOut> selectByExample(TxOutExample example);

    TxOut selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") TxOut row, @Param("example") TxOutExample example);

    int updateByExampleWithBLOBs(@Param("row") TxOut row, @Param("example") TxOutExample example);

    int updateByExample(@Param("row") TxOut row, @Param("example") TxOutExample example);

    int updateByPrimaryKeySelective(TxOut row);

    int updateByPrimaryKeyWithBLOBs(TxOut row);

    int updateByPrimaryKey(TxOut row);
}