package com.mahoo.hippus.common;

import org.springframework.http.HttpStatus;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@RestControllerAdvice
public class RestExceptionHandler {
    /**
     * 默认全局异常处理。
     * @param e the e
     * @return ResultResponse
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResultResponse<String> exception(Exception e) {
        return ResultResponse.failure(ResultCode.INTERNAL_SERVER_ERROR);

    }
    /**
     * 方法参数错误异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResultResponse methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e) {
        // 然后提取错误提示信息进行返回
        return ResultResponse.failure(new BaseResultInterface() {
            @Override
            public Integer getResultCode() {
                return ResultCode.PARAMS_IS_INVALID.getResultCode();
            }

            @Override
            public String getResultMsg() {
                return e.getBindingResult().getAllErrors().stream()
                        .map(ObjectError::getDefaultMessage)
                        .collect(Collectors.joining("; "));
            }
        });
    }
//    @ExceptionHandler(MYException.class)
//    public ResultResponse Exception(Exception e){
//        return ResultResponse.failure(ResultCode.INTERNAL_SERVER_ERROR);
//    }

}
