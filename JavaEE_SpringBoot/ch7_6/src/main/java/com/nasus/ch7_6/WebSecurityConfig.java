package com.nasus.ch7_6;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Project Name:LearningSpringBoot <br/>
 * Package Name:com.nasus.ch7_6 <br/>
 * Date:2018/10/6 18:34 <br/>
 * <b>Description:</b> TODO: 描述该类的作用 <br/>
 *
 * @author <a href="turodog@foxmail.com">nasus</a><br/>
 * Copyright Notice =========================================================
 * This file contains proprietary information of Eastcom Technologies Co. Ltd.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2018 =======================================================
 */
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http)throws Exception{
        http.authorizeRequests()
            .antMatchers("","login").permitAll()
            .anyRequest().authenticated()
            .and()
            .formLogin()
            .loginPage("login")
            .defaultSuccessUrl("chat")
            .permitAll()
            .and()
            .logout()
            .permitAll();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication()
            .withUser("czy").password("czy").roles("USER")
            .and()
            .withUser("czy").password("czy").roles("USER");
    }

    @Override
    public void configure(WebSecurity web)throws Exception{
        web.ignoring().antMatchers("resourcesstatic/**");
    }
}
