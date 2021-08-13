package com.tn666.demo.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "blog")
public class BlogConfig {

    private Integer id;

    private String title;

    private List<String> tags;

    private List<RelationBlogConfig> relationBlog;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<RelationBlogConfig> getRelationBlog() {
        return this.relationBlog;
    }

    public void setRelationBlog(List<RelationBlogConfig> relationBlog) {
        this.relationBlog = relationBlog;
    }

}
