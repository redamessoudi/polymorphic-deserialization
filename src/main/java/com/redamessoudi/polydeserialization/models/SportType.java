package com.redamessoudi.polydeserialization.models;

/**
 * @author Reda Messoudi
 */
public enum SportType {

  FOOTBALL("FOOTBALL"),
  TENNIS("TENNIS"),
  BASKET("BASKET");

  private final String value;

  SportType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SportType fromValue(String text) {
    for (SportType sportType : SportType.values()) {
      if (String.valueOf(sportType.value).equals(text)) {
        return sportType;
      }
    }
    return null;
  }
}
