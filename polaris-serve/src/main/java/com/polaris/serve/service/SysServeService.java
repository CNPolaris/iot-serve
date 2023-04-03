package com.polaris.serve.service;

import com.polaris.mbg.entity.SysServe;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author tian
* @description 针对表【sys_serve】的数据库操作Service
* @createDate 2023-04-03 13:50:45
*/
public interface SysServeService extends IService<SysServe> {
    List<SysServe> getServeAddressList();
}
