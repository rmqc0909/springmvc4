package com.wisely.highlight_springmvc4.web.ch4_5;

import org.apache.commons.io.FileUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Created by xiedan on 2017/1/8.
 */
@RestController
public class UploadController {
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String upload(MultipartFile file) {
        try {
            FileUtils.writeByteArrayToFile(new File("/Users/xiedan/upload/" + file.getOriginalFilename()), file.getBytes());
            return "ok";
        } catch (IOException e) {
            e.printStackTrace();
            return "wrong";
        }
    }

}
