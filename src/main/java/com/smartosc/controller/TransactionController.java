package com.smartosc.controller;

import com.smartosc.common.response.BaseResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/transactions")
public class TransactionController {
    public BaseResponse getListTransactions() {
        return BaseResponse.success("hihi");
    }
}
