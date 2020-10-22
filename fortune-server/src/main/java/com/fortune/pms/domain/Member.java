package com.fortune.pms.domain;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Member {
  final static int ADMINISTER = 1;
  final static int NORMAL_USER = 2;

  private String name;
  private String password;
  private String id;
  private String gender;
  private int age;
  private int userGrade;
  private String checkMemberGrade;
  private Date registeredDate;

  private List<String> fortuneList = new ArrayList<>();
  private List<String> favoriteFortuneList = new ArrayList<>();

  public Member() {
    this.id = "admin";
    this.password = "1234";
    this.name = "관리자";
  }

  public Member(String id, String password, String name, String gender, int age) {
    this.id = id;
    this.password = password;
    this.name = name;
    this.gender = gender;
    this.age = age;
  }

  public List<String> getFortuneList() {
    return fortuneList;
  }

  public void setFortuneList(List<String> fortuneList) {
    this.fortuneList = fortuneList;
  }

  public List<String> getFavoriteFortuneList() {
    return favoriteFortuneList;
  }

  public void setFavoriteFortuneList(List<String> favoriteFortuneList) {
    this.favoriteFortuneList = favoriteFortuneList;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getCheckBadMember() {
    return checkMemberGrade;
  }

  public void setCheckBadMember(String checkBadMember) {
    this.checkMemberGrade = checkBadMember;
  }

  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public Date getRegisteredDate() {
    return registeredDate;
  }
  public void setRegisteredDate(Date registeredDate) {
    this.registeredDate = registeredDate;
  }

  public int getUserGrade() {
    return userGrade;
  }
}
