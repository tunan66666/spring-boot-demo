package com.tn666.demo.controller;

import com.tn666.demo.entity.user.UserInfoPo;
import com.tn666.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserInfoController {

    @Resource
    private UserService userService;

    @GetMapping(value = "/get")
    public UserInfoPo get(@RequestParam("userId") String userId) {
        UserInfoPo res = userService.get(userId);
        return res;
    }

    @PostMapping(value = "/insert")
    public Boolean insert(@RequestBody UserInfoPo userInfoPo) {
        userService.insert(userInfoPo);
        Boolean res = false;
        if (userInfoPo.getId() > 0) {
            res = true;
        }
        return res;
    }

}
