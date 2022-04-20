package com.example.main;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
// properties 可以理解为为当前测试用例添加临时的属性配置
// @SpringBootTest(properties = {"test.prop=testValue1"})
// args可以为当前测试用例添加临时的属性配置
@SpringBootTest(
    properties = {"test.prop=testValue1"},
    args = {"--test.prop=testValue2"})
class MainTest {
  @Value("${test.prop}")
  private String message;

  @Test
  void testProperties() {
    assertThat(message).isEqualTo("testValue2");
//    System.out.println(message);
  }
}
