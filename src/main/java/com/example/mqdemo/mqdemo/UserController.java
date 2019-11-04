package com.example.mqdemo.mqdemo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api("用户")
@RequestMapping("/user")
@RestController
public class UserController {


    @PostMapping("/add")
    public String add(@RequestParam String uname,@RequestParam String upass){
        System.out.println("新增用户");
        return "hello,world";
    }

}
