package com.example.main;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * @author iPisces42
 * @version 1.0
 * @className WebTest
 * @description TODO
 * @date 2022年04月06日 17:15
 */
@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
// 开启虚拟MVC调用
@AutoConfigureMockMvc
// @Transactional
class WebTest {
  @Autowired MockMvc mvc;

  @Test
  void testWeb() throws Exception {
    RequestBuilder builder = MockMvcRequestBuilders.get("/books");
    var action = mvc.perform(builder);
    //    设置预期值,与真实值进行比较,成功测试通过,失败测试案例
    //    定义本次调用的预期值
    var status = MockMvcResultMatchers.status();
    //    预计本次调用成功的:状态200
    var ok = status.isOk();
    //    添加预期值到本次调用过程中进行匹配
    action.andExpect(ok);
  }

  @Test
  void testBody() throws Exception {
    RequestBuilder builder = MockMvcRequestBuilders.get("/books");
    var action = mvc.perform(builder);
    //    设置预期值,与真实值进行比较,成功测试通过,失败测试案例
    //    定义本次调用的预期值
    var content = content();
    //    预计本次调用成功的:状态200
    var result = content.string("spring boot");
    //    添加预期值到本次调用过程中进行匹配
    action.andExpect(result);
  }

  @Test
  void testJson() throws Exception {
    var book = new Book(1, "spring boot", "springboot", "springboot");
    var builder = get("/books");
    var actions = mvc.perform(builder);
    actions
        .andExpectAll(
            MockMvcResultMatchers.status().isOk(),
            content().contentType(MediaType.APPLICATION_JSON),
            jsonPath("$.id", Is.is(book.getId())),
            jsonPath("$.name", Is.is(book.getName())))
        .andDo(print());

    // Verify the results

  }

  @Test
  void testJsonType() throws Exception {
    // Setup
    // Run the test
    var builder = get("/books");

    var action = mvc.perform(builder);
    var header = MockMvcResultMatchers.header();
    var contentType = header.string("Content-Type", "application/json");

    action.andExpectAll(contentType);
  }
}
