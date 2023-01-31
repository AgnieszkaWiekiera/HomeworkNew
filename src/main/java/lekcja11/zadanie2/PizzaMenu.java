package lekcja11.zadanie2;

import java.util.Arrays;
import java.util.List;

public class PizzaMenu {
    List<Pizza> menu = Arrays.asList(
            new Pizza(true, Arrays.asList("mozzarella", "pomidorki", "rukola", "sos pomidorowy"), 350, "Caprese"),
            new Pizza(true, Arrays.asList("mozzarella", "pieczarki", "sos pomidorowy", "oregano", "seler"), 400, "Fungi"),
            new Pizza(false, Arrays.asList("mozzarella", "czosnek", "salami", "oregano"), 500, "Salame"),
            new Pizza(false, Arrays.asList("mozzarella", "kurczak", "sos pomidorowy", "oregano"), 450, "Marinara"),
            new Pizza(true, Arrays.asList("mozzarella", "cukinia", "papryka", "czerwona cebula", "sos pomidorowy", "kukurydza", "seler"), 420, "Vegeteriana"),
            new Pizza(false, Arrays.asList("mozarella", "szynka parmeńska", "rukola", "sos pomidorowy", "parmezan"), 550, "Parma"),
            new Pizza(false, Arrays.asList("mozzarella", "bekon", "szynka parmeńska", "gruszka", "sos pomidorowy"), 490, "Prosciutto"),
            new Pizza(true, Arrays.asList("mozzarella", "szpinak", "salami", "jajko", "sos pomidorowy"), 460, "Spinaci"),
            new Pizza(false, Arrays.asList("mozzarella", "salami", "pepperoni", "pomidor", "papryka", "chili"), 560, "Diavolo"),
            new Pizza(false, Arrays.asList("mozarella", "krewetki", "paluszki krabowe", "czosnek", "sos pomidorowy"), 590, "Frutti di mare")
    );

    public void searchMenu() {
        menu.stream()
                .filter(Pizza::isVegetarian)
                .map(Pizza::getName)
                .forEach(System.out::println);
        menu.stream()
                .filter(pizza -> pizza.getIngredients().contains("seler"))
                .map(Pizza::getName)
                .forEach(System.out::println);
        if (menu.stream()
                .filter(pizza -> pizza.isVegetarian() && pizza.getIngredients().contains("pomidor") && pizza.getIngredients().contains("papryka"))
                .findAny()
                .isPresent()) {
            System.out.println("W menu znajduje się przynajmniej jedna pizza wegetariańska z pomidorem i papryką");
        } else {
            System.out.println("W menu nie ma pizzy wegetariańskiej z pomidorem i papryką");
        }

        if (menu.stream().allMatch(pizza -> pizza.getIngredients().contains("mozzarella"))){
            System.out.println("wszytskie pizze w menu zawierają mozzarelle");
        } else {
            System.out.println("nie wszytskie dania zawierają mozzarelle");
        }

        Pizza pizzaMaxCal = menu.stream()
                .max((p1, p2) -> Integer.compare(p1.getCalories(), p2.getCalories()))
                .orElse(null);
        System.out.println("Najbardziej kaloryczna pizza to: " + pizzaMaxCal.getName());

        Pizza pizzaMinCal = menu.stream()
                .min((p1, p2) -> Integer.compare(p1.getCalories(), p2.getCalories()))
                .orElse(null);
        System.out.println("Najmniej kaloryczna pizza to: " + pizzaMinCal.getName());
    }

    public static void main(String[] args) {
        PizzaMenu pizzaMenu = new PizzaMenu();
        pizzaMenu.searchMenu();
    }
}

