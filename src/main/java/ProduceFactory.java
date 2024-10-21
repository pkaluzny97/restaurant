

import domain.ProductType;
import domain.eto.Produce;

public class ProduceFactory {
    public static Produce createTomato() {
        Produce tomato = new Produce();
        tomato.setName("Tomato");
        tomato.setProductType(ProductType.VEGETABLE);
        return tomato;
    }

    public static Produce createFish() {
        Produce fish = new Produce();
        fish.setName("Fish");
        fish.setProductType(ProductType.MEAT);
        return fish;
    }

    public static Produce createChickenNuggets() {
        Produce chickenNuggets = new Produce();
        chickenNuggets.setName("Chicken nuggets");
        chickenNuggets.setProductType(ProductType.MEAT);
        return chickenNuggets;
    }

    public static Produce createChips() {
        Produce chips = new Produce();
        chips.setName("Chips");
        chips.setProductType(ProductType.VEGETABLE);
        return chips;
    }

    public static Produce createPotatoes() {
        Produce potatoes = new Produce();
        potatoes.setName("Potatoes");
        potatoes.setProductType(ProductType.VEGETABLE);
        return potatoes;
    }

    public static Produce createEgg() {
        Produce egg = new Produce();
        egg.setName("Egg");
        egg.setProductType(ProductType.DAIRY);
        return egg;
    }

    public static Produce createMilk() {
        Produce milk = new Produce();
        milk.setName("Milk");
        milk.setProductType(ProductType.DAIRY);
        return milk;
    }

    public static Produce createBeef() {
        Produce beef = new Produce();
        beef.setName("Beef");
        beef.setProductType(ProductType.MEAT);
        return beef;
    }

    public static Produce createCarrot() {
        Produce carrot = new Produce();
        carrot.setName("Carrot");
        carrot.setProductType(ProductType.VEGETABLE);
        return carrot;
    }

    public static Produce createLettuce() {
        Produce lettuce = new Produce();
        lettuce.setName("Lettuce");
        lettuce.setProductType(ProductType.VEGETABLE);
        return lettuce;
    }

    public static Produce createCheese() {
        Produce cheese = new Produce();
        cheese.setName("Lettuce");
        cheese.setProductType(ProductType.VEGETABLE);
        return cheese;
    }


    public static Produce createGarlic() {
        Produce garlic = new Produce();
        garlic.setName("Garlic");
        garlic.setProductType(ProductType.VEGETABLE);
        return garlic;
    }

    public static Produce createMushroom() {
        Produce mushroom = new Produce();
        mushroom.setName("Mushroom");
        mushroom.setProductType(ProductType.VEGETABLE);
        return mushroom;
    }

    public static Produce createChickenBreast() {
        Produce chickenBreast = new Produce();
        chickenBreast.setName("Chicken breast");
        chickenBreast.setProductType(ProductType.MEAT);
        return chickenBreast;
    }
}
