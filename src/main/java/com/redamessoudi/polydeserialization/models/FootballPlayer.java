package com.redamessoudi.polydeserialization.models;

/**
 * @author Reda Messoudi
 */
public class FootballPlayer extends Player {

  private String team;
  private String position;

  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  @Override
  public String toString() {
    return "FootballPlayer{" +
        "team='" + team + '\'' +
        ", position='" + position + '\'' +
        '}';
  }
}
