package com.tn666.demo.dao;

import com.tn666.demo.entity.Blog;
import org.apache.ibatis.annotations.*;

@Mapper
public interface BlogMapper {

    @Select("select * from blog where id = #{id}")
    Blog getById(@Param("id") Integer id);

    // 返回主键字段id值
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    @Insert("insert into blog(title, category) values(#{blog.title}, #{blog.category})")
    int insert(@Param("blog") Blog blog);

}
