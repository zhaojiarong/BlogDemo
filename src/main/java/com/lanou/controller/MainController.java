package com.lanou.controller;

import com.lanou.bean.BlogBean;
import com.lanou.bean.UserBean;
import com.lanou.service.BlogService;
import com.lanou.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import java.util.List;

/**
 * Created by dllo on 18/2/26.
 */
@Controller
public class MainController {

    @Resource
    private UserService userService;
    @Resource
    private BlogService blogService;

    @RequestMapping(value = "/home")
    String goHome() {
        return "home";
    }

    @RequestMapping(value = "/login")
    String login() {
        return "login";
    }

    @RequestMapping(value = "/regist")
    String regist() {
        return "regist";
    }

    @ResponseBody
    @RequestMapping(value = "/getall")
    List<UserBean> getall() {
        return userService.getall();
    }

    @RequestMapping(value = "/loginS")
    public String loginS(@Param("name") String name,
                         @Param("password") String password,
                         HttpSession session) {
        UserBean ub = userService.findUser(name, password);
        if (ub == null) {
            return "loginfail";
        } else {
            session.setAttribute("username", name);
            session.setAttribute("uid", ub.getId());
            return "loginsuccess";
        }
    }

    @RequestMapping(value = "/registS")
    public String insertUser(@Param("name") String name,
                             @Param("password") String password) {
        int count = userService.insertUser(name, password);
        if (count > 0) {
            return "rsuccess";
        } else {
            return "rfail";
        }
    }

    @RequestMapping(value = "/newBlog")
    public String newBlogPage() {
        return "newBlog";
    }

    @RequestMapping(value = "/makeNew")
    public String makeNew(@Param("title") String title,
                          @Param("des") String des,
                          @Param("content") String content,
                          HttpSession session) {
        BlogBean bb = new BlogBean();
        bb.setTitle(title);
        bb.setTitle(des);
        bb.setContent(content);
        Integer userId = (Integer) session.getAttribute("uid");
        bb.setUserId(userId);
        int num = blogService.makeNew(title, des, content, userId);
        if (num > 0) {
            return "home";
        } else {
            return "";
        }

    }

}
