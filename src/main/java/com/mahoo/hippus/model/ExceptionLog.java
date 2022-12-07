package com.mahoo.hippus.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 接口异常记录表
 * @TableName exception_log
 */
@TableName(value ="exception_log", schema = "public")
@Data
public class ExceptionLog implements Serializable {
    /**
     * 异常ID
     */
    @TableId(type = IdType.AUTO)
    private Object id;

    /**
     * 异常信息
     */
    private String exceptionMessage;

    /**
     * 异常名称
     */
    private String exceptionName;

    /**
     * 异常方法
     */
    private String method;

    /**
     * 异常请求参数
     */
    private String requestParam;

    /**
     * 异常请求IP
     */
    private String ip;

    /**
     * 异常请求地址
     */
    private String url;

    /**
     * 异常用户ID
     */
    private Object userId;

    /**
     * 异常用户名称
     */
    private String userName;

    /**
     * 异常创建时间
     */
    private Date createTime;

    /**
     * 程序版本
     */
    private String version;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ExceptionLog other = (ExceptionLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getExceptionMessage() == null ? other.getExceptionMessage() == null : this.getExceptionMessage().equals(other.getExceptionMessage()))
            && (this.getExceptionName() == null ? other.getExceptionName() == null : this.getExceptionName().equals(other.getExceptionName()))
            && (this.getMethod() == null ? other.getMethod() == null : this.getMethod().equals(other.getMethod()))
            && (this.getRequestParam() == null ? other.getRequestParam() == null : this.getRequestParam().equals(other.getRequestParam()))
            && (this.getIp() == null ? other.getIp() == null : this.getIp().equals(other.getIp()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getExceptionMessage() == null) ? 0 : getExceptionMessage().hashCode());
        result = prime * result + ((getExceptionName() == null) ? 0 : getExceptionName().hashCode());
        result = prime * result + ((getMethod() == null) ? 0 : getMethod().hashCode());
        result = prime * result + ((getRequestParam() == null) ? 0 : getRequestParam().hashCode());
        result = prime * result + ((getIp() == null) ? 0 : getIp().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", exceptionMessage=").append(exceptionMessage);
        sb.append(", exceptionName=").append(exceptionName);
        sb.append(", method=").append(method);
        sb.append(", requestParam=").append(requestParam);
        sb.append(", ip=").append(ip);
        sb.append(", url=").append(url);
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", createTime=").append(createTime);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}