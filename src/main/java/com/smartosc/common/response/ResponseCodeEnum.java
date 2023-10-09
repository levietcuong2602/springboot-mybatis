package com.smartosc.common.response;

public enum ResponseCodeEnum implements IErrorCode {
    /**
     * 操作成功码
     */
    SUCCESS(200, "successful!"),

    /**
     * 操作失败码
     */
    FAILED(500, "server internal error"),

    /**
     * 参数错误码
     */
    VALIDATE_FAILED(404, "not found"),

    /**
     * 会话过时码
     */
    UNAUTHORIZED(401, "unauthenticated"),

    /**
     * 权限不足码
     */
    FORBIDDEN(403, "unauthorized");

    /**
     * 返回结果码
     */
    private long code;

    /**
     * 返回信息内容
     */
    private String message;

    /**
     * 私有类构造器
     *
     * @param code    结果码
     * @param message 信息内容
     */

    ResponseCodeEnum(long code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 返回结果码
     *
     * @return 结果码
     */
    @Override
    public long getCode() {
        return code;
    }

    /**
     * 返回结果信息
     *
     * @return 结果信息
     */
    @Override
    public String getMessage() {
        return message;
    }
}
