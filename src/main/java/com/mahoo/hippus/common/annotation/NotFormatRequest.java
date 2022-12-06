package com.mahoo.hippus.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 用于标记 Controller 内不使用统一返回格式的请求方法
 * @author Mahoo12138
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface NotFormatRequest {
}