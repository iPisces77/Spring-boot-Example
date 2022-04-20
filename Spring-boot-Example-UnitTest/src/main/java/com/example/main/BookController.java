package com.example.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author iPisces42
 * @date 2022年04月06日 17:40
 */
@RestController
@RequestMapping("/books")
public class BookController {
//  @GetMapping
//  public String getById() {
//    System.out.println("getById is running......");
//    return "spring boot";
//  }

  @GetMapping
  public Book getById() {
    System.out.println("getById is running......");
    return new Book(1, "spring boot", "springboot", "springboot");
  }
}
