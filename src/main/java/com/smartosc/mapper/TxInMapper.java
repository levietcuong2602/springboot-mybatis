package com.smartosc.mapper;

import com.smartosc.entity.TxIn;
import com.smartosc.entity.TxInExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TxInMapper {
    long countByExample(TxInExample example);

    int deleteByExample(TxInExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TxIn row);

    int insertSelective(TxIn row);

    List<TxIn> selectByExample(TxInExample example);

    TxIn selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") TxIn row, @Param("example") TxInExample example);

    int updateByExample(@Param("row") TxIn row, @Param("example") TxInExample example);

    int updateByPrimaryKeySelective(TxIn row);

    int updateByPrimaryKey(TxIn row);
}