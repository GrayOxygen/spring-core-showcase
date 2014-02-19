/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.tutorial.configuration.beansconfig.javaconfig;

import com.spring.tutorial.configuration.beansconfig.javaconfig.beans.Foo;
import com.spring.tutorial.configuration.beansconfig.javaconfig.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author macbookpro3
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Foo foo = ctx.getBean(Foo.class);
        ((AnnotationConfigApplicationContext) ctx).close();
    }
}
