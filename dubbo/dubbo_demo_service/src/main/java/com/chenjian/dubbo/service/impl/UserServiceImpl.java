package com.chenjian.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.chenjian.dubbo.service.UserService;

//此处注意导包必须使用com.alibaba.dubbo.config.annotation.Service，因为需要对外发布，这样才能注册到注册中心
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getName() {
        return "xiaomaiyun";
    }
}
