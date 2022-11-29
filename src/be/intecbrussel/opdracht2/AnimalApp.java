package be.intecbrussel.opdracht2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnimalApp {
    public static void main(String[] args) {

        List<Animal> newAnimals = new ArrayList<>();
        newAnimals.add(new Monkey(true, 3, "Jef", 45, true));

        Map<Disease, Boolean> booleanMap = new HashMap<>();
        booleanMap.put(Disease.FLUE, true);
    }
}
