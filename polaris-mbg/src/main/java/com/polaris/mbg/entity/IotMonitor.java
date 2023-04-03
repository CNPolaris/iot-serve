package com.polaris.mbg.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName iot_monitor
 */
@TableName(value ="iot_monitor")
public class IotMonitor implements Serializable {
    /**
     * 
     */
    @TableId
    private Long id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Long projectId;

    /**
     * 
     */
    private Integer status;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private String monitorKey;

    /**
     * 
     */
    private Long createUser;

    /**
     * 
     */
    private String describes;

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
    public String getMonitorKey() {
        return monitorKey;
    }

    /**
     * 
     */
    public void setMonitorKey(String monitorKey) {
        this.monitorKey = monitorKey;
    }

    /**
     * 
     */
    public Long getCreateUser() {
        return createUser;
    }

    /**
     * 
     */
    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
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