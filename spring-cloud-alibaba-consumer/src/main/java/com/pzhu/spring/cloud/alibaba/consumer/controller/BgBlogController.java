package com.pzhu.spring.cloud.alibaba.consumer.controller;

import com.pzhu.spring.cloud.alibaba.common.domain.BgBlog;

import com.pzhu.spring.cloud.alibaba.consumer.service.BgBlogServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestHeader;
import java.util.List;
import org.springframework.http.HttpHeaders;

/**
 * @Author Guo Huaijian
 * @Date 2020/3/16 19:03
 */
@RestController
public class BgBlogController {

    @Autowired
    private BgBlogServiceFeign serviceFeign;

    /**
     * 查询列表
     * @return
     */
    @GetMapping("list")
    public List<BgBlog> list(@RequestHeader HttpHeaders headers){
        System.out.println("consumer controller 输出headers......");
        System.out.println("|--------------begin--------------------|");
        headers.forEach((key, value) -> System.out.println(key + ": " + value));
        System.out.println("|--------------end--------------------|");
        return serviceFeign.list();
    }

    @GetMapping("hello")
    public String hello(@RequestHeader HttpHeaders headers){
        System.out.println("consumer......");
        System.out.println("|--------------begin--------------------|");
        headers.forEach((key, value) -> System.out.println(key + ": " + value));
        System.out.println("|--------------end--------------------|");
        return "hehe";
    }
}
