package lekcja8.zadanie1;

import java.util.*;

public class NameList {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Anna", "Katarzyna", "Tymon", "Tadeusz", "Anna", "Karolina", "Dorota", "Piotr");

        Set<String> uniqueNames = new HashSet<>(names);
        System.out.println("Lista bez duplikatów: " + uniqueNames);

        Collections.reverse(names);
        System.out.println("Elementy w odwrotnej kolejności: " + names);

        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equals("Anna")) {
                names.set(i, "Joanna");
            }
        }
        System.out.println("Elementy po zmianie: Anna -> Joanna: " + names);
    }
}
