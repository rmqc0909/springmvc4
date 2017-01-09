package com.wisely.highlight_springmvc4.advice;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by xiedan on 2017/1/8.
 */
@ControllerAdvice
public class ExceptionHandlerAdvice {
    //定制错误页面信息
    @ExceptionHandler
    public ModelAndView exception(Exception exception, WebRequest webRequest) {
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("errorMessage", exception.getMessage());
        return modelAndView;
    }
    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("msg", "多余信息");
    }
    //定制WebDataBinder,此处演示忽略requset参数的name
/*    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        webDataBinder.setDisallowedFields("name");
    }*/

}

