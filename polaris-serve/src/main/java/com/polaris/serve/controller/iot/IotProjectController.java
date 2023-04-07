package com.polaris.serve.controller.iot;

import com.polaris.api.iot.IotProjectApi;
import com.polaris.model.iot.CreateProjectRequest;
import com.polaris.model.iot.GetMyProjectRequest;
import com.polaris.common.dto.RespBean;
import com.polaris.security.util.JwtTokenUtil;
import com.polaris.serve.service.IotProjectService;
import com.polaris.serve.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author: polaris
 */
@RestController("IotProjectController")
public class IotProjectController implements IotProjectApi {
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private IotProjectService projectService;

    @Autowired
    private SysUserService userService;

    @Override
    public ResponseEntity<RespBean> iotProjectPost(Principal principal, String authorization, CreateProjectRequest request) {
        String email = principal.getName();
        Long userId = userService.getUserIdByName(email);
        return new ResponseEntity<>(projectService.createIotProject(userId, 1, request), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<RespBean> iotProjectGet(Principal principal, Integer cur_region, String authorization, GetMyProjectRequest request) {
        // 暂时不分页查询
        System.out.print(cur_region);
        String email = principal.getName();
        Long userId = userService.getUserIdByName(email);
        return new ResponseEntity<>(projectService.getMyProject(userId), HttpStatus.OK);
    }
    @Override
    public ResponseEntity<RespBean> iotProjectDelete(Principal principal, String authorization, Long projectId) {
        String email = principal.getName();
        Long userId = userService.getUserIdByName(email);

        return projectService.deleteProject(userId, projectId);
    }

    @Override
    public ResponseEntity<RespBean> iotProjectGetDetail(Principal principal, String authorization, Long projectId) {
        return projectService.getProjectDetail(projectId);
    }
}
