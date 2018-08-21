package entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Project Name:properties <br/>
 * Package Name:entity <br/>
 * Date:2018/8/21 0021 16:12 <br/>
 * <b>Description:</b> TODO: 描述该类的作用 <br/>
 *
 * @author <a href="mailto:chenzy@eastcom-sw.com">chenzy</a><br/>
 * Copyright Notice =========================================================
 * This file contains proprietary information of Eastcom Technologies Co. Ltd.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2018 =======================================================
 */
@Component
public class BlogPropertiesEntity {

    @Value("${com.nasus.blog.name}")
    private String name;
    @Value("${com.nasus.blog.title}")
    private String title;
    @Value("${com.nasus.blog.desc}")
    private String desc;

    @Value("${com.nasus.blog.value}")
    private String value;
    @Value("${com.nasus.blog.number}")
    private Integer number;
    @Value("${com.nasus.blog.bignumber}")
    private Long bignumber;
    @Value("${com.nasus.blog.test1}")
    private Integer test1;
    @Value("${com.nasus.blog.test2}")
    private Integer test2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Long getBignumber() {
        return bignumber;
    }

    public void setBignumber(Long bignumber) {
        this.bignumber = bignumber;
    }

    public Integer getTest1() {
        return test1;
    }

    public void setTest1(Integer test1) {
        this.test1 = test1;
    }

    public Integer getTest2() {
        return test2;
    }

    public void setTest2(Integer test2) {
        this.test2 = test2;
    }
}
