package com.tn666.demo.controller;

import com.tn666.demo.configuration.BlogConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("blog")
public class BlogController {

    @Value("${blog.title}")
    private String blogTitle;

    @Autowired
    private BlogConfig blogConfig;

    private final static Logger logger = LoggerFactory.getLogger(BlogController.class);

    @GetMapping(value = "getBlogTitle")
    public String getBlogTitle() {
        return this.blogTitle;
    }

    @GetMapping(value = "getBlogId")
    public Integer getBlogId() {
        return blogConfig.getId();
    }

    @GetMapping(value = "getBlogConfig")
    public BlogConfig getBlogConfig() {
        return blogConfig;
    }

    @GetMapping(value = "log")
    public String printLog() {
        logger.trace("trace log");
        logger.debug("debug log");
        logger.info("info log");
        logger.warn("warn log");
        logger.error("error log");
        return "print log ok";
    }

}
