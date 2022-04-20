package com.example.main.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author iPisces42
 * @date 2022年04月06日 14:04
 */
@Configuration

public class MsgConfig {
@Bean
   String msg(){
       return "Hello World!";
   }
}

