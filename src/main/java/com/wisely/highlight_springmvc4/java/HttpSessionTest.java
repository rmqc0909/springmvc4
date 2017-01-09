package com.wisely.highlight_springmvc4.java;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by xiedan11 on 2017/1/9.
 */
public class HttpSessionTest {
    public void getSession(HttpServletRequest request) {
        HttpSession session = request.getSession();
        String name = (String) session.getAttribute("name");
    }
}
