package com.nasus.highlight_springmvc.web.ch4_3;

import com.nasus.highlight_springmvc.domain.DemoObj;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project Name:LearningSpringBoot <br/>
 * Package Name:com.nasus.highlight_springmvc.web.ch4_3 <br/>
 * Date:2018/9/8 16:27 <br/>
 * <b>Description:</b> TODO: 描述该类的作用 <br/>
 *
 * @author <a href="turodog@foxmail.com">nasus</a><br/>
 * Copyright Notice =========================================================
 * This file contains proprietary information of Eastcom Technologies Co. Ltd.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2018 =======================================================
 */
@RestController
@RequestMapping("/rest")
public class DemoRestController {

    @RequestMapping(value = "/getjson",
            produces={"application/json;charset=UTF-8"}) //2
    public DemoObj getjson (DemoObj obj){
        return new DemoObj(obj.getId()+1, obj.getName()+"yy");//3
    }

    @RequestMapping(value = "/getxml",
            produces={"application/xml;charset=UTF-8"})//4
    public DemoObj getxml(DemoObj obj){
        return new DemoObj(obj.getId()+1, obj.getName()+"yy");
    }
}
