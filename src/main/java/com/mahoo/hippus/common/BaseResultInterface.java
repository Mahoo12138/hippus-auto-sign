package com.mahoo.hippus.common;

public interface BaseResultInterface {
    /**
     * 响应码
     *
     * @return
     */
    Integer getResultCode();
    /**
     * 错误描述
     * @return
     */
    String getResultMsg();
}