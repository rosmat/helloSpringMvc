package com.mycompany.helloworld.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.mycompany.helloworld.service" })
public class SpringRootConfig {
}
