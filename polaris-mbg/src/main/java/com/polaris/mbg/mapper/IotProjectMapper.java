package com.polaris.mbg.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.polaris.model.iot.GetMyProjectResponse;
import com.polaris.model.iot.GetProjectDetailResponse;
import com.polaris.mbg.entity.IotProject;

import java.util.List;

/**
* @author tian
* @description 针对表【iot_project】的数据库操作Mapper
* @createDate 2023-04-02 14:00:29
* @Entity com.polaris.mbg.entity.IotProject
*/
public interface IotProjectMapper extends BaseMapper<IotProject> {
    List<GetMyProjectResponse> getMyProjectList(Long userId);
    GetProjectDetailResponse getProjectDetail(Long projectId);


}
