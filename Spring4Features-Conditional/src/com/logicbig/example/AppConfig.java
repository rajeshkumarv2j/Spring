package com.logicbig.example;
org.apache.struts.taglib.html.TOKEN=164c7b39f86755dccc370889ac92a36f&forwardURL=%2FpreferenceSetHandler.do%3F_k%3D126*1199570%26_a%3Dview%22accesskey=%22x%22onclick=%22document.body.innerHTML=1%22x=%22

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    //default constructor
    AppConfig(){
    }
    @Bean
    @Conditional(LocaleConditionUSA.class)
    public MyService myBeanA () {
        return new MyServiceA();
    }

    @Bean
    @Conditional(LocaleConditionCanada.class)
    public MyService myBeanB () {
        return new MyServiceB();
    }

    @Bean
    public ClientBean clientBean () {
        return new ClientBean();
    }
}
