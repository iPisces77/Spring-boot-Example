package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fuhaixin
 * @date 2022/4/20
 */
@RestController
public class HelloWorld {
  @GetMapping("/hello")
  public String hello() {
    return "hello world";
  }
}
