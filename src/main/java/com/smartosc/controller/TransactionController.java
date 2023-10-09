package com.smartosc.controller;

import com.smartosc.common.response.BaseResponse;
import com.smartosc.common.response.BaseResponsePage;
import com.smartosc.datasource.entity.Transaction;
import com.smartosc.datasource.vo.TransactionVo4List;
import com.smartosc.service.TransactionService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/transactions")
public class TransactionController {
    @Resource
    private TransactionService transactionService;

    @GetMapping()
    public BaseResponse<BaseResponsePage<TransactionVo4List>> getListTransactions(@RequestParam Integer pageNum, @RequestParam Integer pageSize) {
        return BaseResponse.success(transactionService.getListTransaction(pageNum, pageSize));
    }
}
