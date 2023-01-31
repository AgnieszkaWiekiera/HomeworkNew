package lekcja11.zadanie2;

import java.util.List;

public class Pizza {
    private boolean isVegetarian;
    private List<String> ingredients;
    private int calories;
    private String name;

    public Pizza(boolean isVegetarian, List<String> ingredients, int calories, String name) {
        this.isVegetarian = isVegetarian;
        this.ingredients = ingredients;
        this.calories = calories;
        this.name = name;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public int getCalories() {
        return calories;
    }

    public String getName() {
        return name;
    }
}
