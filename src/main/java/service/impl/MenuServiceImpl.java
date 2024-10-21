package service.impl;

import domain.DietType;
import domain.eto.Meal;
import domain.eto.Produce;
import service.api.MenuService;

import java.util.List;
import java.util.stream.Collectors;

//TODO IMPLEMENT
public class MenuServiceImpl implements MenuService {

    @Override
    public List<Meal> findVegetarianFood(List<Meal> meals) {
        return meals.stream()
                .filter(meal -> meal.getDietType() == DietType.VEGETARIAN)
                .collect(Collectors.toList());
    }

    @Override
    public List<Meal> findFoodByType(List<Meal> meals, DietType diet) {
        return meals.stream()
                .filter(meal -> meal.getDietType() == diet)
                .collect(Collectors.toList());
    }

    @Override
    public List<Meal> findFoodCheaperThanPrice(List<Meal> meals, Integer price) {
        return meals.stream()
                .filter(meal -> meal.getPrice() < price )
                .collect(Collectors.toList());
    }

    @Override
    public List<Meal> findFoodCheaperWithCalories(List<Meal> meals, Integer minCalories, Integer maxCalories) {
        return meals.stream()
                .filter(meal -> meal.getCalories() >= minCalories && meal.getCalories() <= maxCalories)
                .collect(Collectors.toList());
    }

    @Override
    public List<Meal> findFoodCheaperThanPrice(List<Meal> meals, String name) {
        return meals.stream()
                .filter(meal -> meal.getName().toLowerCase().startsWith(name.toLowerCase()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Meal> findFoodContaining(List<Meal> meals, Produce product) {
        return meals.stream()
                .filter(meal -> meal.getProducts().contains(product))
                .collect(Collectors.toList());
    }

    @Override
    public List<Meal> findFoodExcludingAll(List<Meal> meals, List<Produce> products) {
        return meals.stream()
                .filter(meal -> products.stream().allMatch(product -> !meal.getProducts().contains(product)))
                .collect(Collectors.toList());
    }
}