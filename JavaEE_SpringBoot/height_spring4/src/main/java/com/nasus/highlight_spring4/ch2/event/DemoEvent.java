package com.nasus.highlight_spring4.ch2.event;

import org.springframework.context.ApplicationEvent;

/**
 * Project Name:LearningSpringBoot <br/>
 * Package Name:com.nasus.highlight_spring4.ch2.event <br/>
 * Date:2018/9/2 22:48 <br/>
 * <b>Description:</b> TODO: 描述该类的作用 <br/>
 *
 * @author <a href="turodog@foxmail.com">nasus</a><br/>
 * Copyright Notice =========================================================
 * This file contains proprietary information of Eastcom Technologies Co. Ltd.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2018 =======================================================
 */
public class DemoEvent extends ApplicationEvent {

    private static final long serialVersionUID = 1L;
    private String msg;

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
