package com.example.main;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.main.config.MsgConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

/**
 * @author iPisces42
 * @version 1.0
 * @className ConfigurationTest
 * @description TODO
 * @date 2022年04月06日 14:04
 */
@SpringBootTest
@Import(MsgConfig.class)
class ConfigurationTest {
  @Autowired private String msg;

  @Test
  void testConfiguration() {
    assertThat(msg).isEqualTo("Hello World!");
    System.out.println(msg);
  }
}
