package com.smartosc.exceptions;


import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Getter
public class BusinessParamCheckingException extends Exception {
        private static final long serialVersionUID = 1L;
        private final int code;
        private final Map<String, Object> data;

        public BusinessParamCheckingException(int code, String reason) {
            super(reason);
            Map<String, Object> objectMap = new HashMap<>();
            objectMap.put("message", reason);
            this.code = code;
            this.data = objectMap;
        }

        public BusinessParamCheckingException(int code, String reason, Throwable throwable) {
            super(reason, throwable);
            Map<String, Object> objectMap = new HashMap<>();
            objectMap.put("message", reason);
            this.code = code;
            this.data = objectMap;
        }
}