package com.tn666.demo.dao.blog;

import com.tn666.demo.entity.blog.BlogPo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogDao {

    @Select("select * from blog where id = #{id}")
    BlogPo getById(@Param("id") Integer id);

    // 返回主键字段id值
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    @Insert("insert into blog(title, category) values(#{blog.title}, #{blog.category})")
    int insert(@Param("blog") BlogPo blogPo);

}
