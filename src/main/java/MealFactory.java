
import domain.DietType;
import domain.ProductType;
import domain.eto.Meal;

import java.util.Arrays;
import java.util.List;

public class MealFactory {

    public static Meal createVegetarianSalad() {
        Meal meal = new Meal();
        meal.setName("Vegetarian Salad");
        meal.setDietType(DietType.VEGETARIAN);
        meal.setProducts(Arrays.asList(
                ProduceFactory.createTomato(),
                ProduceFactory.createCarrot(),
                ProduceFactory.createMushroom()));
        meal.setCalories(150);
        meal.setPrice(10);
        return meal;
    }

    public static Meal createCheesePizza() {
        Meal meal = new Meal();
        meal.setName("Cheese Pizza");
        meal.setDietType(DietType.VEGETARIAN);
        meal.setProducts(Arrays.asList(
                ProduceFactory.createTomato(),
                ProduceFactory.createCheese()));
        meal.setCalories(300);
        meal.setPrice(20);
        return meal;
    }

    public static Meal createChickenSandwich() {
        Meal meal = new Meal();
        meal.setName("Chicken Sandwich");
        meal.setDietType(DietType.REGULAR);
        meal.setProducts(Arrays.asList(
                ProduceFactory.createLettuce(),
                ProduceFactory.createChickenBreast()));
        meal.setCalories(250);
        meal.setPrice(15);
        return meal;
    }

    public static Meal createFishAndChips() {
        Meal meal = new Meal();
        meal.setName("Fish and Chips");
        meal.setDietType(DietType.REGULAR);
        meal.setProducts(Arrays.asList(
                ProduceFactory.createFish(),
                ProduceFactory.createChips()));
        meal.setCalories(450);
        meal.setPrice(18);
        return meal;
    }

    public static Meal createEggAndPotato() {
        Meal meal = new Meal();
        meal.setName("Egg and Potato");
        meal.setDietType(DietType.VEGETARIAN);
        meal.setProducts(Arrays.asList(
                ProduceFactory.createEgg(),
                ProduceFactory.createPotatoes()));
        meal.setCalories(300);
        meal.setPrice(12);
        return meal;
    }

    public static Meal createBeefStew() {
        Meal meal = new Meal();
        meal.setName("Beef Stew");
        meal.setDietType(DietType.REGULAR);
        meal.setProducts(Arrays.asList(
                ProduceFactory.createBeef(),
                ProduceFactory.createCarrot(),
                ProduceFactory.createGarlic()));
        meal.setCalories(600);
        meal.setPrice(25);
        return meal;
    }

    public static Meal createMushroomSoup() {
        Meal meal = new Meal();
        meal.setName("Mushroom Soup");
        meal.setDietType(DietType.VEGETARIAN);
        meal.setProducts(Arrays.asList(
                ProduceFactory.createMushroom(),
                ProduceFactory.createGarlic()));
        meal.setCalories(200);
        meal.setPrice(8);
        return meal;
    }

    public static Meal createChickenNuggetsAndFries() {
        Meal meal = new Meal();
        meal.setName("Chicken Nuggets and Fries");
        meal.setDietType(DietType.REGULAR);
        meal.setProducts(Arrays.asList(
                ProduceFactory.createChickenNuggets(),
                ProduceFactory.createChips()));
        meal.setCalories(500);
        meal.setPrice(15);
        return meal;
    }

    public static Meal createGarlicBread() {
        Meal meal = new Meal();
        meal.setName("Garlic Bread");
        meal.setDietType(DietType.VEGETARIAN);
        meal.setProducts(Arrays.asList(
                ProduceFactory.createGarlic(),
                ProduceFactory.createCheese()));
        meal.setCalories(350);
        meal.setPrice(7);
        return meal;
    }

    public static Meal createTomatoSoup() {
        Meal meal = new Meal();
        meal.setName("Tomato Soup");
        meal.setDietType(DietType.VEGETARIAN);
        meal.setProducts(Arrays.asList(
                ProduceFactory.createCarrot(),
                ProduceFactory.createTomato()));
        meal.setCalories(180);
        meal.setPrice(6);
        return meal;
    }

    public static Meal createMilkshake() {
        Meal meal = new Meal();
        meal.setName("Milkshake");
        meal.setDietType(DietType.VEGETARIAN);
        meal.setProducts(Arrays.asList(
                ProduceFactory.createMilk()));
        meal.setCalories(350);
        meal.setPrice(5);
        return meal;
    }

    public static Meal createVegetableStirFry() {
        Meal meal = new Meal();
        meal.setName("Vegetable Stir Fry");
        meal.setDietType(DietType.VEGETARIAN);
        meal.setProducts(Arrays.asList(
                ProduceFactory.createCarrot(),
                ProduceFactory.createMushroom(),
                ProduceFactory.createTomato()));
        meal.setCalories(400);
        meal.setPrice(14);
        return meal;
    }
}