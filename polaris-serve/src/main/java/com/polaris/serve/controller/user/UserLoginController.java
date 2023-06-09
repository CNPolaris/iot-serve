package com.polaris.serve.controller.user;


import com.polaris.api.user.LoginApi;
import com.polaris.model.user.login.UserLoginRequest;
import com.polaris.common.dto.RespBean;
import com.polaris.serve.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: polaris
 */
@RestController("UserLoginController")
public class UserLoginController implements LoginApi {
    @Autowired
    private SysUserService userService;

//    @Override
//    public ResponseEntity<RespBean> register(RegisterRequest body) {
//        return new ResponseEntity<>(userService.userRegister(body), HttpStatus.OK);
//    }

    @Override
    public ResponseEntity<RespBean> iotLoginPost(UserLoginRequest request) {
        return new ResponseEntity<>(userService.userLogin(request), HttpStatus.OK);
    }
}
