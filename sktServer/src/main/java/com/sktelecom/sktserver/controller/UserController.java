package com.sktelecom.sktserver.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping("/test")
    @ApiOperation(value="테스트")
    public ResponseEntity test(){
        System.out.println("출력");

        return new ResponseEntity(HttpStatus.valueOf(200));
    }
}
