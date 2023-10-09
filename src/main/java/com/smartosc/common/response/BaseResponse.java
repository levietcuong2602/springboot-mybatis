package com.smartosc.common.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

/**
 * The object return base response
 * @param <T>
 * @author cuonglv
 */
@Data
@AllArgsConstructor
public class BaseResponse<T> implements Serializable {
    /**
     * 结果码
     */
    @ApiModelProperty(value = "result code")
    private Long code;

    /**
     * 提示信息
     */
    @ApiModelProperty(value = "result message")
    private String message;

    /**
     * 返回数据
     */
    @ApiModelProperty(value = "result data")
    private T data;

    /**
     * 返回成功结果
     */
    public static <T> BaseResponse<T> success() {
        return new BaseResponse<T>(ResponseCodeEnum.SUCCESS.getCode(),
                ResponseCodeEnum.SUCCESS.getMessage(), null);
    }

    /**
     * 成功返回结果
     *
     * @param data 获取的数据
     */
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<T>(ResponseCodeEnum.SUCCESS.getCode(),
                ResponseCodeEnum.SUCCESS.getMessage(), data);
    }

    /**
     * 成功返回结果
     *
     * @param data    获取的数据
     * @param message 提示信息
     */
    public static <T> BaseResponse<T> success(T data, String message) {
        return new BaseResponse<T>(ResponseCodeEnum.SUCCESS.getCode(), message, data);
    }

    /**
     * 失败返回结果
     *
     * @param errorCode 错误码
     */
    private static <T> BaseResponse<T> failed(IErrorCode errorCode) {
        return new BaseResponse<T>(errorCode.getCode(), errorCode.getMessage(), null);
    }

    /**
     * 失败返回结果
     *
     * @param message 提示信息
     */
    public static <T> BaseResponse<T> failed(String message) {
        return new BaseResponse<T>(ResponseCodeEnum.FAILED.getCode(),
                message, null);
    }

    /**
     * 失败返回结果
     */
    public static <T> BaseResponse<T> failed() {
        return failed(ResponseCodeEnum.FAILED);
    }

    /**
     * 参数验证失败返回结果
     */
    public static <T> BaseResponse<T> validateFailed() {
        return failed(ResponseCodeEnum.VALIDATE_FAILED);
    }

    /**
     * 参数验证失败返回结果
     *
     * @param message 提示信息
     */
    public static <T> BaseResponse<T> validateFailed(String message) {
        return new BaseResponse<T>(ResponseCodeEnum.VALIDATE_FAILED.getCode(),
                message, null);
    }

    /**
     * 未登录返回结果
     */
    public static <T> BaseResponse<T> unauthorized(T data) {
        return new BaseResponse<T>(ResponseCodeEnum.UNAUTHORIZED.getCode(),
                ResponseCodeEnum.UNAUTHORIZED.getMessage(), data);
    }

    /**
     * 未授权返回结果
     */
    public static <T> BaseResponse<T> forbidden(T data) {
        return new BaseResponse<T>(ResponseCodeEnum.FORBIDDEN.getCode(),
                ResponseCodeEnum.FORBIDDEN.getMessage(), data);
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BaseResponse{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        BaseResponse<?> that = (BaseResponse<?>) o;
        return Objects.equals(code, that.code) &&
                Objects.equals(message, that.message) &&
                Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message, data);
    }
}