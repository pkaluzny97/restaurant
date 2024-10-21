import domain.eto.Meal;
import service.impl.MenuServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

  public static void main(String[] args) {

    System.out.print("Wybierz rodzaj dania:");
    MenuServiceImpl menuService = new MenuServiceImpl();

    List<Meal> meals = new ArrayList<>();
    meals.add(MealFactory.createVegetarianSalad());
    meals.add(MealFactory.createCheesePizza());
    meals.add(MealFactory.createChickenSandwich());
    meals.add(MealFactory.createFishAndChips());
    meals.add(MealFactory.createEggAndPotato());
    meals.add(MealFactory.createBeefStew());
    meals.add(MealFactory.createMushroomSoup());
    meals.add(MealFactory.createChickenNuggetsAndFries());
    meals.add(MealFactory.createGarlicBread());
    meals.add(MealFactory.createTomatoSoup());
    meals.add(MealFactory.createMilkshake());
    meals.add(MealFactory.createVegetableStirFry());

    menuService.findVegetarianFood(meals);

    List<Meal> vegetarianMeals = menuService.findVegetarianFood(meals);

    System.out.println("Vegetarian Meals:");
    for (Meal meal : vegetarianMeals) {
      System.out.println(meal.getName());
    }

  }
}
