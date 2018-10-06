package com.nasus.ch7_6.web;

import com.nasus.ch7_6.domain.nasusMessage;
import com.nasus.ch7_6.domain.nasusResponse;
import java.security.Principal;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

/**
 * Project Name:LearningSpringBoot <br/>
 * Package Name:com.nasus.ch7_6.web <br/>
 * Date:2018/10/6 17:59 <br/>
 * <b>Description:</b> TODO: 描述该类的作用 <br/>
 *
 * @author <a href="turodog@foxmail.com">nasus</a><br/>
 * Copyright Notice =========================================================
 * This file contains proprietary information of Eastcom Technologies Co. Ltd.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2018 =======================================================
 */
@Controller
public class WsController {

    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public nasusResponse say(nasusMessage message) throws Exception{
        Thread.sleep(3000);
        return new nasusResponse("welcome" + message.getName() + "!");
    }

    @Resource
    private SimpMessagingTemplate messagingTemplate;

    @MessageMapping("/chat")
    public void handleChat(Principal principal, String msg) { //2
        if (principal.getName().equals("wyf")) {//3
            messagingTemplate.convertAndSendToUser("wisely",
                    "/queue/notifications", principal.getName() + "-send:"
                            + msg);
        } else {
            messagingTemplate.convertAndSendToUser("wyf",
                    "/queue/notifications", principal.getName() + "-send:"
                            + msg);
        }
    }
}
