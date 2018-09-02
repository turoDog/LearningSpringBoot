package com.nasus.highlight_spring4.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Project Name:LearningSpringBoot <br/>
 * Package Name:com.nasus.highlight_spring4.ch2.event <br/>
 * Date:2018/9/2 22:51 <br/>
 * <b>Description:</b> TODO: 描述该类的作用 <br/>
 *
 * @author <a href="turodog@foxmail.com">nasus</a><br/>
 * Copyright Notice =========================================================
 * This file contains proprietary information of Eastcom Technologies Co. Ltd.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2018 =======================================================
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    public void onApplicationEvent(DemoEvent event) {

        String msg = event.getMsg();

        System.out.println("我(bean-demoListener)接受到了bean-demoPublisher发布的消息:"
                + msg);

    }


}
