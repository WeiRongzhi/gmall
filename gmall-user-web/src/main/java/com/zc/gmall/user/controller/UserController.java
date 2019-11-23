package com.zc.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zc.gmall.service.UserService;
import com.zc.gmall.bean.UmsMember;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Reference
    private UserService userService;

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMembers = userService.getAllUser();
        return umsMembers;
    }
    @RequestMapping("index")
    @ResponseBody
    public String index() {
        return "hello user";
    }
}
