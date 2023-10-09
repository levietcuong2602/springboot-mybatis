package com.smartosc.mapper;

import com.smartosc.entity.Block;
import com.smartosc.entity.BlockExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlockMapper {
    long countByExample(BlockExample example);

    int deleteByExample(BlockExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Block row);

    int insertSelective(Block row);

    List<Block> selectByExample(BlockExample example);

    Block selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") Block row, @Param("example") BlockExample example);

    int updateByExample(@Param("row") Block row, @Param("example") BlockExample example);

    int updateByPrimaryKeySelective(Block row);

    int updateByPrimaryKey(Block row);
}