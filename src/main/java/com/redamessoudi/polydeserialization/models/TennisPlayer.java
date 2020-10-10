package com.redamessoudi.polydeserialization.models;

/**
 * @author Reda Messoudi
 */
public class TennisPlayer extends Player {

  private int atpPoints;

  public int getAtpPoints() {
    return atpPoints;
  }

  public void setAtpPoints(int atpPoints) {
    this.atpPoints = atpPoints;
  }

  @Override
  public String toString() {
    return "TennisPlayer{" +
        "atpPoints=" + atpPoints +
        '}';
  }
}
