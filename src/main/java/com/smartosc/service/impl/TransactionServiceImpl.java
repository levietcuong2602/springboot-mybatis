package com.smartosc.service.impl;

import com.smartosc.common.response.BaseResponsePage;
import com.smartosc.datasource.entity.TransactionExample;
import com.smartosc.datasource.mapper.TransactionMapper;
import com.smartosc.datasource.mapper.TransactionMapperEx;
import com.smartosc.datasource.vo.TransactionVo4List;
import com.smartosc.service.TransactionService;
import jakarta.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {
    private static final Logger LOGGER = LoggerFactory.getLogger(TransactionServiceImpl.class);

    @Resource
    private TransactionMapper transactionMapper;
    @Resource
    private TransactionMapperEx transactionMapperEx;

    @Override
    public BaseResponsePage<TransactionVo4List> getListTransaction(Integer pageNum, Integer pageSize) {
        TransactionExample example = new TransactionExample();
        example.createCriteria();
        long totalRecord = transactionMapper.countByExample(example);
        int offset = pageNum > 0 ? (pageNum - 1) * pageSize : 0;

        List<TransactionVo4List> transactionList = transactionMapperEx.selectByCondition(offset, pageSize);

        return BaseResponsePage.pagination(transactionList, pageNum, pageSize, totalRecord);
    }
}
