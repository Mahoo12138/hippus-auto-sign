package com.mahoo.hippus.common.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.annotation.*;


/**
 * 标记使用统一返回格式的 Controller
 * @author Mahoo12138
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Controller
@ResponseBody
public @interface FormatRestController {
}
