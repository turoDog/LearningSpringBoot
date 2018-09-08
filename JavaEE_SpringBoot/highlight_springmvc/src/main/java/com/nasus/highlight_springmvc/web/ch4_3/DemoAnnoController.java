package com.nasus.highlight_springmvc.web.ch4_3;

import com.nasus.highlight_springmvc.domain.DemoObj;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Project Name:LearningSpringBoot <br/>
 * Package Name:com.nasus.highlight_springmvc.web.ch4_3 <br/>
 * Date:2018/9/8 16:18 <br/>
 * <b>Description:</b> TODO: 描述该类的作用 <br/>
 *
 * @author <a href="turodog@foxmail.com">nasus</a><br/>
 * Copyright Notice =========================================================
 * This file contains proprietary information of Eastcom Technologies Co. Ltd.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2018 =======================================================
 */
@Controller
@RequestMapping("/anno")
public class DemoAnnoController {

    @RequestMapping(produces = "text/plain;charset=UTF-8")
    public @ResponseBody String index(HttpServletRequest request){
        return "url:"+ request.getRequestURI()+" can access";
    }

    @RequestMapping(value = "/pathvar/{str}", produces = "text/plain;charset=UTF-8")// 5
    public @ResponseBody String demoPathVar(@PathVariable String str,
            HttpServletRequest request){
        return "url:" + request.getRequestURL() + " can access,str: " + str;
    }

    @RequestMapping(value = "/requestParam", produces = "text/plain;charset=UTF-8") //6
    public @ResponseBody String passRequestParam(Long id,
            HttpServletRequest request) {

        return "url:" + request.getRequestURL() + " can access,id: " + id;

    }

    @RequestMapping(value = "/obj", produces = "application/json;charset=UTF-8")//7
    @ResponseBody //8
    public String passObj(DemoObj obj, HttpServletRequest request) {

        return "url:" + request.getRequestURL()
                + " can access, obj id: " + obj.getId()+" obj name:" + obj.getName();

    }

    @RequestMapping(value = { "/name1", "/name2" }, produces = "text/plain;charset=UTF-8")//9
    public @ResponseBody String remove(HttpServletRequest request) {

        return "url:" + request.getRequestURL() + " can access";
    }
}
