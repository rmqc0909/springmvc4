package com.wisely.highlight_springmvc4.web.ch4_5;

import com.wisely.highlight_springmvc4.service.PushService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * Created by xiedan11 on 2017/1/11.
 * 通过控制器从另一个线程返回一个DeferredResult.
 */
@RestController
public class AysncController {
    @Autowired
    PushService pushService;

    @RequestMapping("/defer")
    public DeferredResult<String> deferredCall() {
        return pushService.getAsyncUpdate();
    }

}
