package com.wisely.highlight_springmvc4.web.ch4_5;

import com.wisely.highlight_springmvc4.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xiedan on 2017/1/10.
 */
@Controller
public class ConverterController {
    @RequestMapping(value = "/convert", produces = { "application/x-wisely" }) //1
    public @ResponseBody
    DemoObj convert(@RequestBody DemoObj demoObj) {
        System.out.println("id:" + demoObj.getId());
        return demoObj;
    }
}
