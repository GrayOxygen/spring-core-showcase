/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.spring.tutorial.configuration.beansconfig.hybrid.config;

import com.spring.tutorial.configuration.beansconfig.hybrid.beans.Bar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author macbookpro3
 */
@Configuration
public class AppConfig {
    @Bean
    public Bar createFoo(){
        return new Bar();
    }
}
