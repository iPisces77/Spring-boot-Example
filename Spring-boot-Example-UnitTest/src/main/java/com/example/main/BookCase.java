package com.example.main;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author iPisces42
 * @date 2022年04月06日 20:08
 */
@Component
@Data
@ConfigurationProperties(prefix = "testcase.book")
public class BookCase {
  private int id;
  private int id2;
  private int id3;
  private String name;
  private String uuid;
  private String publishTime;
}
