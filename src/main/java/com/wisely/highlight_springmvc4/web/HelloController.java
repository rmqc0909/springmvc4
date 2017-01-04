package com.wisely.highlight_springmvc4.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by xiedan11 on 2017/1/4.
 */
@Controller
public class HelloController {
    @RequestMapping("/index")
    public String hello(HttpServletRequest request) {
        System.out.println(request.getParameter("username"));
        return "page";
    }
}
