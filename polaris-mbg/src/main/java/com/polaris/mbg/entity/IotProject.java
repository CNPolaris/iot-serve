package com.polaris.mbg.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName iot_project
 */
@TableName(value ="iot_project")
public class IotProject implements Serializable {
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
    private String projectKey;

    /**
     * 
     */
    private Long createUser;

    /**
     * 
     */
    private Integer userCount;

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
    public String getProjectKey() {
        return projectKey;
    }

    /**
     * 
     */
    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
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
    public Integer getUserCount() {
        return userCount;
    }

    /**
     * 
     */
    public void setUserCount(Integer userCount) {
        this.userCount = userCount;
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