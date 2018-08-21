package com.nasus.domain.s;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Project Name:LearningSpringBoot <br/>
 * Package Name:com.nasus.domain.s <br/>
 * Date:2018/8/21 20:51 <br/>
 * <b>Description:</b> TODO: 描述该类的作用 <br/>
 *
 * @author <a href="turodog@foxmail.com">nasus</a><br/>
 * Copyright Notice =========================================================
 * This file contains proprietary information of Eastcom Technologies Co. Ltd.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2018 =======================================================
 */
public interface MessageRepository extends JpaRepository<Message, Long> {
}
