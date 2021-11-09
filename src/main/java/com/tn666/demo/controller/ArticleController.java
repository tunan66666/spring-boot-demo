package com.tn666.demo.controller;

import com.tn666.demo.entity.blog.ArticlePo;
import com.tn666.demo.service.ArticleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Resource
    private ArticleService articleService;

    @GetMapping(value = "/get")
    public ArticlePo get(@RequestParam("articleId") String articleId) {
        ArticlePo articlePo = articleService.get(articleId);
        return articlePo;
    }

    @PostMapping(value = "/insert")
    public Boolean insert(@RequestBody ArticlePo articlePo) {
        articleService.insert(articlePo);
        Boolean res = false;
        if (articlePo.getId() > 0) {
            res = true;
        }
        return res;
    }

}
