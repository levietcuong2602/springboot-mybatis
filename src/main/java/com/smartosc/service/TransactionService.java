package com.smartosc.service;

import com.smartosc.common.response.BaseResponsePage;
import com.smartosc.datasource.entity.Transaction;
import com.smartosc.datasource.vo.TransactionVo4List;

public interface TransactionService {
    /**
     * @param pageNum
     * @param pageSize
     * @return list transaction
     */
    BaseResponsePage<TransactionVo4List> getListTransaction(Integer pageNum, Integer pageSize);
}
