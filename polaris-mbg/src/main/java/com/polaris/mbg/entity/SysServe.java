package com.polaris.mbg.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @TableName sys_serve
 */
@TableName(value ="sys_serve")
@Data
public class SysServe implements Serializable {
    private Integer id;

    private String name;

    private String address;

    private Integer port;

    private Integer status;

    private static final long serialVersionUID = 1L;
}