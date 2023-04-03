package com.polaris.serve.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.polaris.model.iot.CreateProjectRequest;
import com.polaris.model.iot.GetMyProjectResponse;
import com.polaris.common.dto.RespBean;
import com.polaris.common.enums.StatusTypeEnum;
import com.polaris.common.utils.Commons;
import com.polaris.mbg.entity.IotProject;
import com.polaris.serve.service.IotProjectService;
import com.polaris.mbg.mapper.IotProjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
* @author tian
* @description 针对表【iot_project】的数据库操作Service实现
* @createDate 2023-04-02 14:00:29
*/
@Service
public class IotProjectServiceImpl extends ServiceImpl<IotProjectMapper, IotProject>
implements IotProjectService{
    @Resource
    private IotProjectMapper projectMapper;

    @Override
    public RespBean createIotProject(Long userId, Integer role, CreateProjectRequest request) {
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        IotProject iotProject = new IotProject();
        iotProject.setProjectKey(uuid);
        iotProject.setStatus(StatusTypeEnum.YES.getCode());
        long time = System.currentTimeMillis();
        iotProject.setCreateTime(new Timestamp(time));
        iotProject.setCreateUser(userId);
        iotProject.setName(request.getName());
        if(role == 1){
            iotProject.setUserCount(Commons.FREE_COUNT - 1);
        } else if (role == 2) {
            iotProject.setUserCount(Commons.STANDARD_COUNT - 1);
        } else if (role == 3) {
            iotProject.setUserCount(Commons.PRO_COUNT - 1);
        }
        save(iotProject);

        return RespBean.success("创建项目成功", iotProject);
    }

    @Override
    public RespBean getMyProject(Long userId) {
        List<GetMyProjectResponse> myProjectList = projectMapper.getMyProjectList(userId);
        return RespBean.success("获取项目成功", myProjectList);
    }
    @Override
    public ResponseEntity<RespBean> getProjectDetail(Long projectId) {
        if (projectId == null){
            return new ResponseEntity<>(RespBean.error("数据不能为空"), HttpStatus.OK);
        }
        return new ResponseEntity<>(RespBean.success(projectMapper.getProjectDetail(projectId)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<RespBean> deleteProject(Long userId, Long projectId) {
        IotProject project = projectMapper.selectById(projectId);
        if (project == null) {
            return new ResponseEntity<>(RespBean.error("项目不存在"), HttpStatus.OK);
        }
        if (!Objects.equals(project.getCreateUser(), userId)) {
            return new ResponseEntity<>(RespBean.error("无权删除"), HttpStatus.OK);
        }
        try{
            removeById(project);
            return new ResponseEntity<>(RespBean.success("删除成功"), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(RespBean.error("删除失败"), HttpStatus.BAD_REQUEST);
        }
    }

}
