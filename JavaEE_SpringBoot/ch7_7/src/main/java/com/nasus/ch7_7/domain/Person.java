package com.nasus.ch7_7.domain;

import jdk.nashorn.internal.objects.annotations.Getter;

/**
 * Project Name:LearningSpringBoot <br/>
 * Package Name:com.nasus.ch7_7.domain <br/>
 * Date:2018/10/6 23:21 <br/>
 * <b>Description:</b> TODO: 描述该类的作用 <br/>
 *
 * @author <a href="turodog@foxmail.com">nasus</a><br/>
 * Copyright Notice =========================================================
 * This file contains proprietary information of Eastcom Technologies Co. Ltd.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2018 =======================================================
 */
@lombok.Data
public class Person {

    private String name;
    private Integer age;
    private String address;

    public Person() {
        super();
    }
    public Person(String name, Integer age, String address) {
        super();
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

}
