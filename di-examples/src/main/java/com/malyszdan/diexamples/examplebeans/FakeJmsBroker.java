package com.malyszdan.diexamples.examplebeans;

public class FakeJmsBroker {

  private String user;
  private String password;
  private String url;

  public void setUser(String user) {
    this.user = user;
  }

  public String getUser() {
    return user;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPassword() {
    return password;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "FakeJmsBroker{" +
        "user='" + user + '\'' +
        ", password='" + password + '\'' +
        ", url='" + url + '\'' +
        '}';
  }
}
