package com.smartosc.exception;

import com.alibaba.fastjson2.JSONObject;
import com.smartosc.constants.ExceptionConstants;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    private final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Object handleException(Exception e, HttpServletRequest request) {
        JSONObject status = new JSONObject();

        // Handling of business parameter exceptions
        if (e instanceof BusinessParamCheckingException) {
            status.put(ExceptionConstants.GLOBAL_RETURNS_CODE, ((BusinessParamCheckingException) e).getCode());
            status.put(ExceptionConstants.GLOBAL_RETURNS_DATA, ((BusinessParamCheckingException) e).getData());
            return status;
        }

        // Handling of business runtime exceptions
        if (e instanceof BusinessRunTimeException) {
            status.put(ExceptionConstants.GLOBAL_RETURNS_CODE, ((BusinessRunTimeException) e).getCode());
            status.put(ExceptionConstants.GLOBAL_RETURNS_DATA, ((BusinessRunTimeException) e).getData());
            return status;
        }

        status.put(ExceptionConstants.GLOBAL_RETURNS_CODE, ExceptionConstants.SERVICE_SYSTEM_ERROR_CODE);
        status.put(ExceptionConstants.GLOBAL_RETURNS_DATA, ExceptionConstants.SERVICE_SYSTEM_ERROR_MSG);
        log.error("Global Exception Occured => url : {}, msg : {}", request.getRequestURL(), e.getMessage());
        /**
         * create by: qiankunpingtai
         * create time: 2019/4/18 17:41
         * The complete stack information is output here, otherwise some exceptions do not know what went wrong at all.
         */
        log.error("Global Exception Occured => url : {}", request.getRequestURL(), e);
        logger.error("Error occurs", e);
        return status;
    }
}
