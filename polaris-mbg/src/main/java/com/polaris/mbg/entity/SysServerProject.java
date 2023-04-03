package com.polaris.mbg.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @TableName sys_server_project
 */
@TableName(value ="sys_server_project")
@Data
public class SysServerProject implements Serializable {
    private Long id;

    private Long projectId;

    private Integer serveId;

    private Integer status;

    private static final long serialVersionUID = 1L;
}