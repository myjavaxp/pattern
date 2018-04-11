package com.yibo.config;

import com.yibo.annotation.Bean;
import com.yibo.annotation.Configuration;
import com.yibo.bean.Person;

@Configuration
public class BeanConfig {
    @Bean
    public Person person(){
        return new Person();
    }
}