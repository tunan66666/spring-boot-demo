package com.tn666.demo.service;

import com.tn666.demo.dao.user.UserInfoMapper;
import com.tn666.demo.entity.user.UserInfoPo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserInfoMapper userInfoMapper;

    public UserInfoPo get(String userId) {
        UserInfoPo res = userInfoMapper.get(userId);
        return res;
    }

    public void insert(UserInfoPo userInfoPo) {
        userInfoMapper.insert(userInfoPo);
    }

}
