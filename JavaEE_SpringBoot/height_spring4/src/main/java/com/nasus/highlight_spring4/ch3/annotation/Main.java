package com.nasus.highlight_spring4.ch3.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Project Name:LearningSpringBoot <br/>
 * Package Name:com.nasus.highlight_spring4.ch3.annotation <br/>
 * Date:2018/9/5 0005 11:18 <br/>
 * <b>Description:</b> TODO: 描述该类的作用 <br/>
 *
 * @author <a href="mailto:chenzy@eastcom-sw.com">chenzy</a><br/>
 * Copyright Notice =========================================================
 * This file contains proprietary information of Eastcom Technologies Co. Ltd.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2018 =======================================================
 */
public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DemoConfig.class);

        DemoService demoService =  context.getBean(DemoService.class);

        demoService.outputResult();

        context.close();
    }

}
