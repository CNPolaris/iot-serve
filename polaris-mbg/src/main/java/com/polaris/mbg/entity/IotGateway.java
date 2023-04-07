package com.polaris.mbg.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName iot_gateway
 */
@TableName(value ="iot_gateway")
public class IotGateway implements Serializable {
    /**
     * 
     */
    @TableId
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String gatewayKey;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private Integer status;

    /**
     * 
     */
    private Long projectId;

    /**
     * 
     */
    private String describes;

    private String imei;

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     */
    public String getGatewayKey() {
        return gatewayKey;
    }

    /**
     * 
     */
    public void setGatewayKey(String gatewayKey) {
        this.gatewayKey = gatewayKey;
    }

    /**
     * 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 
     */
    public Long getProjectId() {
        return projectId;
    }

    /**
     * 
     */
    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    /**
     * 
     */
    public String getDescribes() {
        return describes;
    }

    /**
     * 
     */
    public void setDescribes(String describes) {
        this.describes = describes;
    }
}