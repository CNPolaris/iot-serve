package com.polaris.mbg.mapper;

import com.polaris.mbg.entity.SysServe;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author tian
* @description 针对表【sys_serve】的数据库操作Mapper
* @createDate 2023-04-03 13:50:45
* @Entity com.polaris.mbg.entity.SysServe
*/
public interface SysServeMapper extends BaseMapper<SysServe> {
    SysServe getByProjectId(Long projectId);
}




