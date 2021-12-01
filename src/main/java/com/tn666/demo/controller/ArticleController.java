package com.tn666.demo.controller;

import com.tn666.demo.dao.blog.ArticleDao;
import com.tn666.demo.entity.blog.ArticlePo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Resource
    private ArticleDao articleDao;

    @GetMapping(value = "/get")
    public ArticlePo get(@RequestParam("articleId") String articleId) {
        ArticlePo articlePo = articleDao.get(articleId);
        return articlePo;
    }

    @PostMapping(value = "/insert")
    public Boolean insert(@RequestBody ArticlePo articlePo) {
        articleDao.insert(articlePo);
        Boolean res = false;
        if (articlePo.getId() > 0) {
            res = true;
        }
        return res;
    }

}
