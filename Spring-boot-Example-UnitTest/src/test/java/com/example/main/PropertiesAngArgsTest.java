package com.example.main;



import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author iPisces42
 * @version 1.0
 * @className PropertiesAngArgsTest
 * @description TODO
 * @date 2022年04月06日 20:13
 */
@SpringBootTest
class PropertiesAngArgsTest {
  @Autowired BookCase bookCase;
  @Test
  void testProperties(){
    assertThat(bookCase).isEqualTo(new BookCase());


  }
}
