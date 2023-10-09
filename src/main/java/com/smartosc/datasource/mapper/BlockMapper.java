package com.smartosc.datasource.mapper;

import com.smartosc.datasource.entity.Block;
import com.smartosc.datasource.entity.BlockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

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