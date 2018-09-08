package com.nasus.highlight_springmvc.web.ch4_5;

import java.util.Random;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Project Name:LearningSpringBoot <br/>
 * Package Name:com.nasus.highlight_springmvc.web.ch4_5 <br/>
 * Date:2018/9/9 0:19 <br/>
 * <b>Description:</b> TODO: 描述该类的作用 <br/>
 *
 * @author <a href="turodog@foxmail.com">nasus</a><br/>
 * Copyright Notice =========================================================
 * This file contains proprietary information of Eastcom Technologies Co. Ltd.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2018 =======================================================
 */
@Controller
public class SseController {

    @RequestMapping(value = "push",produces = "text/event-stream")
    public @ResponseBody String puah(){
        Random random = new Random();
        try {
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "data:Testing 1,2,3" + random.nextInt() + "\n\n";
    }
}
