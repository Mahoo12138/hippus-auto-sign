package com.mahoo.hippus.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultResponse <T> implements Serializable {
    /**
     * 响应状态
     */
    private Boolean success;
    /**
     * 响应代码
     */
    private String code;
    /**
     * 响应消息
     */
    private String message;
    /**
     * 响应结果
     */
    private T data;
    public ResultResponse(BaseResultInterface res) {
        this.code = String.valueOf(res.getResultCode());
        this.message = res.getResultMsg();
        this.success = Objects.equals(res.getResultCode(), ResultCode.SUCCESS.getResultCode());
    }
    public  static ResultResponse success(){
        ResultResponse resultResponse = new ResultResponse(ResultCode.SUCCESS);
        return resultResponse;
    }
    public  static<T> ResultResponse success(T t){
        ResultResponse resultResponse = success();
        resultResponse.setData(t);
        return resultResponse;
    }
    public  static ResultResponse failure(BaseResultInterface resultCode){
        ResultResponse resultResponse = new ResultResponse(resultCode);
        return resultResponse;
    }
    public  static<T> ResultResponse failure(BaseResultInterface resultCode, T t){
        ResultResponse resultResponse = failure(resultCode);
        resultResponse.setData(t);
        return resultResponse;
    }
}