package controllerTest;

import static org.junit.Assert.assertEquals;

import controller.HelloWorldController;
import org.junit.Test;

/**
 * Project Name:springboot-helloworld <br/>
 * Package Name:controllerTest <br/>
 * Date:2018/8/21 0021 15:45 <br/>
 * <b>Description:</b> TODO: 描述该类的作用 <br/>
 *
 * @author <a href="mailto:chenzy@eastcom-sw.com">chenzy</a><br/>
 * Copyright Notice =========================================================
 * This file contains proprietary information of Eastcom Technologies Co. Ltd.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2018 =======================================================
 */
public class HelloWorldControllerTest {

    @Test
    public void testSayHello() {
        assertEquals("Hello,World!",new HelloWorldController().sayHello());
    }

}
