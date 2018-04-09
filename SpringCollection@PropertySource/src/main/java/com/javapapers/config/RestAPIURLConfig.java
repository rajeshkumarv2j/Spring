package com.javapapers.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

import com.javapapers.model.Resource;

@Configuration
@PropertySources
({
	@PropertySource(value="classpath:default.properties"),
	@PropertySource(value="classpath:application.properties",ignoreResourceNotFound=true)
})
public class RestAPIURLConfig {
    
	@Value("${restapi.url}")
    private String restAPIUrl;
	
	@Autowired
	private Environment env;
	
	@Bean
    protected Resource database() {
		Resource resource = new Resource();
		resource.setUrl(restAPIUrl+"\n"+env.getProperty("name")+"\n"+env.getProperty("job"));
        return resource;
    }
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(RestAPIURLConfig.class);
		Resource resource = context.getBean(Resource.class);
		System.out.println(resource.getUrl());
	}
}
