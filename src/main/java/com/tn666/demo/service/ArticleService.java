package com.tn666.demo.service;

import com.tn666.demo.dao.blog.ArticleMapper;
import com.tn666.demo.entity.blog.ArticlePo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ArticleService {

    @Resource
    private ArticleMapper articleMapper;

    public ArticlePo get(String articleId) {
        ArticlePo articlePo = articleMapper.get(articleId);
        return articlePo;
    }

    public void insert (ArticlePo articlePo) {
        articleMapper.insert(articlePo);
    }

}
