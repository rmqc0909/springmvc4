package com.wisely.highlight_springmvc4.web.ch4_5;

import com.wisely.highlight_springmvc4.domain.DemoObj;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xiedan on 2017/1/10.
 */
@RestController
public class ConverterController {
    @RequestMapping(value = "/convert", produces = {"application/x-wisely"})
    public DemoObj converter(DemoObj obj) {
        return obj;
    }

}
