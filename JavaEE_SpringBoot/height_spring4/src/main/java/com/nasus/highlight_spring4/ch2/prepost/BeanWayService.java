package com.nasus.highlight_spring4.ch2.prepost;

/**
 * Project Name:LearningSpringBoot <br/>
 * Package Name:com.nasus.highlight_spring4.ch2.prepost <br/>
 * Date:2018/9/2 22:36 <br/>
 * <b>Description:</b> TODO: 描述该类的作用 <br/>
 *
 * @author <a href="turodog@foxmail.com">nasus</a><br/>
 * Copyright Notice =========================================================
 * This file contains proprietary information of Eastcom Technologies Co. Ltd.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2018 =======================================================
 */
public class BeanWayService {
    public void init(){
        System.out.println("@Bean-init-method");
    }
    public BeanWayService() {
        super();
        System.out.println("初始化构造函数-BeanWayService");
    }
    public void destroy(){
        System.out.println("@Bean-destory-method");
    }
}
