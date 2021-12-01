package com.tn666.demo.dao.blog;

import com.tn666.demo.entity.blog.ArticlePo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleDao {

    @Select("select * from article where article_id = #{articleId}")
    @Results({@Result(column = "article_id", property = "articleId")})
    ArticlePo get(@Param("articleId") String articleId);

    // 给article赋值自增主键id
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    @Insert("insert into article(article_id, title) values(#{article.articleId}, #{article.title})")
    int insert(@Param("article") ArticlePo articlePo);

}
