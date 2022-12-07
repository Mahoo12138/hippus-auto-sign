package com.mahoo.hippus.common.annotation;

import java.lang.annotation.*;

/**
 * 定义操作日志注解
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface OperLog {
    String operModule() default ""; // 操作模块
    String operType() default "";  // 操作类型
    String operDescription() default "";  // 操作说明
}
