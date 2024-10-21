package service.impl;

import java.util.ArrayList;
import java.util.List;

import domain.DietType;
import domain.eto.Meal;
import service.exception.NoFoodFoundException;

/**
 * This is just a showcase
 */
public class MenuExample2 extends MenuExample {

  /**
   * This is just showcase to tell you how to implement most basic operations in JAVA.
   * In productive apps that Use Spring and JPA, similar functionalities are implemented by writing a proper query.
   * @param meals Input list
   * @return List of meals that are  of type vegetarian
   */
  @Override
  public List<Meal> findVegetarianFood(List<Meal> meals) {

    List<Meal> filtered = super.findVegetarianFood(meals);
    return filtered;
  }

}
