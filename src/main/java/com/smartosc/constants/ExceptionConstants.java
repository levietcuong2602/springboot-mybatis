package com.smartosc.constants;

import com.alibaba.fastjson2.JSONObject;

public class ExceptionConstants {
    /**
     * code format type+five digits, for example 3500000
     * ResourceInfo(value = "inOutItem", type = 35)
     */

    public static final String GLOBAL_RETURNS_CODE = "code";
    public static final String GLOBAL_RETURNS_MESSAGE = "msg";
    public static final String GLOBAL_RETURNS_DATA = "data";

    /**
     * normal return / operation succeeded
     **/
    public static final int SERVICE_SUCCESS_CODE = 200;
    public static final String SERVICE_SUCCESS_MSG = "Success";

    /**
     * Data query exception
     */
    public static final int DATA_READ_FAIL_CODE = 300;
    public static final String DATA_READ_FAIL_MSG = "Query data exception";
    /**
     * Data writing exception
     */
    public static final int DATA_WRITE_FAIL_CODE = 301;
    public static final String DATA_WRITE_FAIL_MSG = "Insert data exception";

    /**
     * Unknown error when the system is running
     **/
    public static final int SERVICE_SYSTEM_ERROR_CODE = 500;
    public static final String SERVICE_SYSTEM_ERROR_MSG = "Unknown exception";

    /**
     * Standard normal return / operation successful return
     *
     * @return
     */
    public static JSONObject standardSuccess() {
        JSONObject success = new JSONObject();
        success.put(GLOBAL_RETURNS_CODE, SERVICE_SUCCESS_CODE);
        success.put(GLOBAL_RETURNS_MESSAGE, SERVICE_SUCCESS_MSG);
        return success;
    }
}
