package com.tn666.demo.dao.user;

import com.tn666.demo.entity.user.UserInfoPo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoDao {

    @Select("select * from user_info where user_id=#{userId}")
    @Results({@Result(column = "user_id", property = "userId")})
    UserInfoPo get(@Param("userId") String userId);

    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    @Insert("insert into user_info(user_id, name) values(#{userInfo.userId}, #{userInfo.name})")
    int insert(@Param("userInfo") UserInfoPo userInfoPo);

}
