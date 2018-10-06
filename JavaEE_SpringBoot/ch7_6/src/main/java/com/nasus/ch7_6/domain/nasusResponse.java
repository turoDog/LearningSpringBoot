package com.nasus.ch7_6.domain;

/**
 * Project Name:LearningSpringBoot <br/>
 * Package Name:com.nasus.ch7_6.domain <br/>
 * Date:2018/10/6 17:57 <br/>
 * <b>Description:</b> TODO: 描述该类的作用 <br/>
 *
 * @author <a href="turodog@foxmail.com">nasus</a><br/>
 * Copyright Notice =========================================================
 * This file contains proprietary information of Eastcom Technologies Co. Ltd.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2018 =======================================================
 */
public class nasusResponse {

    private String responseMessage;

    public nasusResponse(String responseMessage){
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage(){
        return responseMessage;
    }
}
