package com.jackiew.springboot.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping(method = RequestMethod.GET)
    public String hello(HttpServletRequest request) {
        final HttpSession session = request.getSession();
        session.setAttribute("someAttribute1", "111");
        session.setAttribute("someAttribute2", "222");
        session.setAttribute("someAttribute3", "333");
        String sessionId = session.getId();
        return "hello your session id:" + sessionId;
    }
}
