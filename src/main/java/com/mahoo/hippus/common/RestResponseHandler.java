package com.mahoo.hippus.common;


import com.alibaba.fastjson.JSON;
import com.mahoo.hippus.common.annotation.FormatRestController;
import com.mahoo.hippus.common.annotation.NotFormatRequest;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@RestControllerAdvice
public class RestResponseHandler implements ResponseBodyAdvice {
    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
//        System.out.println(aClass.getName());
        //判断是否使用了自定义注解
        if(methodParameter.getDeclaringClass().isAnnotationPresent(FormatRestController.class)){
            if(methodParameter.hasMethodAnnotation(NotFormatRequest.class)){
                return false;
            }
            return true;
        }
        return false;
    }
    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        if (o instanceof ResultResponse) {
            return o;
        } else if (o instanceof String) {
            // string 类型返回要单独json序列化返回一下，不然会报转换异常
            return JSON.toJSONString(ResultResponse.success(o));
        } else {
            return ResultResponse.success(o);
        }
    }
}

