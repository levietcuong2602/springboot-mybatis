package com.smartosc.utils;

import com.alibaba.fastjson2.JSONObject;

public class JsonUtils {
    public static JSONObject ok() {
        JSONObject obj = new JSONObject();
        JSONObject tmp = new JSONObject();
        tmp.put("message", "success");
        obj.put("code", 200);
        obj.put("data", tmp);
        return obj;
    }
}
