package com.wisely.highlight_springmvc4.interceptor;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by xiedan on 2017/1/7.
 * 1.afterCompletion:在整个视图渲染完毕之后执行方法里面内容,主要用于释放一些资源
 * 2.postHandle:在Controller执行之后,视图渲染之前执行方法里面的内容
 * 3.preHandle:在Controller执行之前,执行方法里面的内容,该方法有返回值,当当返回值为false时整个请求就结束了
 */
public class DemoInterceptor1 extends HandlerInterceptorAdapter{

    @Override
    public boolean preHandle(HttpServletRequest request, //2
                             HttpServletResponse response, Object handler) throws Exception {
        long startTime = System.currentTimeMillis();
        request.setAttribute("startTime", startTime);
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }

    @Override
    public void postHandle(HttpServletRequest request, //3
                           HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        long startTime = (Long) request.getAttribute("startTime");
        request.removeAttribute("startTime");
        long endTime = System.currentTimeMillis();
        System.out.println("本次请求耗时11111111: " + new Long(endTime - startTime)+"ms");
        request.setAttribute("handlingTime", endTime - startTime);
    }

}
