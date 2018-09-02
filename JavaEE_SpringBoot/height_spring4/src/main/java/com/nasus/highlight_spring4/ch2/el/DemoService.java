package com.nasus.highlight_spring4.ch2.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Project Name:LearningSpringBoot <br/>
 * Package Name:com.nasus.highlight_spring4.ch2.el <br/>
 * Date:2018/9/2 21:42 <br/>
 * <b>Description:</b> TODO: 描述该类的作用 <br/>
 *
 * @author <a href="turodog@foxmail.com">nasus</a><br/>
 * Copyright Notice =========================================================
 * This file contains proprietary information of Eastcom Technologies Co. Ltd.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2018 =======================================================
 */
@Service
public class DemoService {
    @Value("其他类的属性")
    private String another;

    public void setAnother(String another) {
        this.another = another;
    }

    public String getAnother(){
        return another;
    }
}
