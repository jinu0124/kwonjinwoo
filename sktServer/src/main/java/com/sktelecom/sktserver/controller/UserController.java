package com.sktelecom.sktserver.controller;

import io.swagger.annotations.ApiOperation;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Iterator;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping("/test")
    @ApiOperation(value="테스트")
    public ResponseEntity test(@RequestParam String code, @RequestParam Map<String, String> state){
        System.out.println(code);
        System.out.println(state);
//        Iterator<String> iter = (Iterator<String>) request.getHeaderNames();
//        for(String s: request.getHeaderNames())


        return ResponseEntity.ok(code);
    }
}
