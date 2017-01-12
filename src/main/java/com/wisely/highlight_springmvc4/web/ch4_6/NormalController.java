package com.wisely.highlight_springmvc4.web.ch4_6;

import com.wisely.highlight_springmvc4.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xiedan11 on 2017/1/12.
 */
@Controller
public class NormalController {
    @Autowired
    DemoService demoService;
    @RequestMapping("/normal")
    public String testPage(Model model) {
        model.addAttribute("msg", demoService.saySomething());
        return "page";
    }
}
