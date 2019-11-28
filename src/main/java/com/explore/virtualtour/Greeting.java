package com.explore.virtualtour;

public class Greeting {
  private final long id;
  private final String content;

  public Greeting (long id, String content) {
    this.id = id;
    this.content = content;
  }

  public long getid() {
    return id;
  }

  public String getContent() {
    return content;
  }
}