package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/myapp")
@Api("Main rest controller")
public class MainController {

    @GetMapping("/greeting")
    @ApiOperation(
            value = "Имя пользователя",
            notes = "Приветсвие")
    public String registry(String userName)  {

        return "hello " + userName;
    }

}
