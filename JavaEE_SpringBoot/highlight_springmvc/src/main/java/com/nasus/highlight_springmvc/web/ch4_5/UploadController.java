package com.nasus.highlight_springmvc.web.ch4_5;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * Project Name:LearningSpringBoot <br/>
 * Package Name:com.nasus.highlight_springmvc.web.ch4_5 <br/>
 * Date:2018/9/8 23:39 <br/>
 * <b>Description:</b> TODO: 描述该类的作用 <br/>
 *
 * @author <a href="turodog@foxmail.com">nasus</a><br/>
 * Copyright Notice =========================================================
 * This file contains proprietary information of Eastcom Technologies Co. Ltd.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2018 =======================================================
 */
@Controller
public class UploadController {

    @RequestMapping(value = "upload",method = RequestMethod.POST)
    public @ResponseBody String upload(MultipartFile file){
        try {
            FileUtils.writeByteArrayToFile(new File("z:/upload/"+file.getOriginalFilename()),
                    file.getBytes());
            return "ok";
        }catch (Exception e){
            e.printStackTrace();
            return "wrong";
        }
    }

}
