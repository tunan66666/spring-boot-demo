package com.tn666.demo.controller;

import com.tn666.demo.dao.user.UserInfoDao;
import com.tn666.demo.entity.user.UserInfoPo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserInfoController {

    @Resource
    private UserInfoDao userInfoDao;

    @GetMapping(value = "/get")
    public UserInfoPo get(@RequestParam("userId") String userId) {
        UserInfoPo res = userInfoDao.get(userId);
        return res;
    }

    @PostMapping(value = "/insert")
    public Boolean insert(@RequestBody UserInfoPo userInfoPo) {
        userInfoDao.insert(userInfoPo);
        Boolean res = false;
        if (userInfoPo.getId() > 0) {
            res = true;
        }
        return res;
    }

}
