/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.spring.tutorial.messages;

import java.util.Locale;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author macbookpro3
 */
public class App {
    
    private final static Log LOGGER = LogFactory.getLog(App.class);
    
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "com/spring/tutorial/messages/applicationContext.xml");
        MessageSource ms = ctx.getBean(MessageSource.class);
        //Message resolution
        String success = ms.getMessage("msg.success", null, Locale.getDefault());
        String successEN = ms.getMessage("msg.success", null, Locale.ENGLISH);
        String successFR = ms.getMessage("msg.success", null, Locale.FRENCH);
        String successDE = ms.getMessage("msg.success", null, Locale.GERMAN);
        //Message resolution and i18n
        String label = ms.getMessage("lbl.result", null, Locale.getDefault());
        String error = ms.getMessage("err.failure", null, Locale.getDefault());
        LOGGER.debug("Success message (es - the default): " + success);
        LOGGER.debug("Success message (en): " + successEN);
        LOGGER.debug("Success message (fr): " + successFR);
        LOGGER.debug("Success message (de) defaults to local language: " + successDE);
        LOGGER.debug("Label text: " + label);
        LOGGER.debug("Error message: " + error);
        ((ClassPathXmlApplicationContext) ctx).close();
    }
}
