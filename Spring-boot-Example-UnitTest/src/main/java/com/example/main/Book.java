package com.example.main;

import java.util.Objects;

/**
 * @author iPisces42
 * @version 1.0
 * @className Book
 * @description  Book
 * @date 2022年04月06日 18:41
 */
public class Book {
  private Integer id;
  private String name;
  private String type;
  private String description;

  @Override
  public String toString() {
    return "Book{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", type='" + type + '\'' +
        ", description='" + description + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Book book = (Book) o;
    return getId().equals(book.getId()) && getName().equals(book.getName()) && getType().equals(
        book.getType()) && getDescription().equals(book.getDescription());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId(), getName(), getType(), getDescription());
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Book() {
  }

  public Book(Integer id, String name, String type, String description) {
    this.id = id;
    this.name = name;
    this.type = type;
    this.description = description;
  }
}
