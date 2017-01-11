package com.wisely.highlight_springmvc4.web.ch4_5;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by xiedan11 on 2017/1/10.
 */
@RestController
public class SseController {
    @RequestMapping(value = "/push", produces = "text/event-stream")
    public String push() {
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "data:Current Time..." + new Date() + "\n\n";
    }
}
