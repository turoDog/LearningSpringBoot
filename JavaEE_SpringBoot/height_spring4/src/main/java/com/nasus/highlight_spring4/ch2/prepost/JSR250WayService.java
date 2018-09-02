package com.nasus.highlight_spring4.ch2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Project Name:LearningSpringBoot <br/>
 * Package Name:com.nasus.highlight_spring4.ch2.prepost <br/>
 * Date:2018/9/2 22:37 <br/>
 * <b>Description:</b> TODO: 描述该类的作用 <br/>
 *
 * @author <a href="turodog@foxmail.com">nasus</a><br/>
 * Copyright Notice =========================================================
 * This file contains proprietary information of Eastcom Technologies Co. Ltd.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2018 =======================================================
 */
public class JSR250WayService {
    @PostConstruct //1
    public void init(){
        System.out.println("jsr250-init-method");
    }
    public JSR250WayService() {
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }
    @PreDestroy //2
    public void destroy(){
        System.out.println("jsr250-destory-method");
    }
}
