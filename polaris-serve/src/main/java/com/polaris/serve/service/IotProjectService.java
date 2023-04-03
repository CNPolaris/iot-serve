package com.polaris.serve.service;

import com.polaris.model.iot.CreateProjectRequest;
import com.polaris.common.dto.RespBean;
import com.polaris.mbg.entity.IotProject;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.http.ResponseEntity;

/**
* @author tian
* @description 针对表【iot_project】的数据库操作Service
* @createDate 2023-04-02 14:00:29
*/
public interface IotProjectService extends IService<IotProject> {
    RespBean createIotProject(Long userId, Integer role, CreateProjectRequest request);

    RespBean getMyProject(Long userId);

    ResponseEntity<RespBean> getProjectDetail(Long projectId);

    ResponseEntity<RespBean> deleteProject(Long userId, Long projectId);

}
