package com.chenjian.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.chenjian.dubbo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    //注意：这里必须使用com.alibaba.dubbo.config.annotation.Reference;因为它远程调用，而不是本地调用，不能使用@Autowired注入，也叫远程注入
    @Reference
    private UserService userService;

    //@ResponseBody表示该返回值为直接输出，如果不加则表示返回的是页面
    @RequestMapping("/showName")
    @ResponseBody
    public String showName() {
        return userService.getName();

    }
}
