package com.redamessoudi.polydeserialization.models;

/**
 * @author Reda Messoudi
 */
public abstract class Player {

  private String id;
  private String fullName;
  private String sportType;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getSportType() {
    return sportType;
  }

  public void setSportType(String sportType) {
    this.sportType = sportType;
  }

  @Override
  public String toString() {
    return "Player{" +
        "id='" + id + '\'' +
        ", fullName='" + fullName + '\'' +
        ", sportType='" + sportType + '\'' +
        '}';
  }
}
