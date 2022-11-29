package be.intecbrussel.opdracht2;

import java.util.HashMap;
import java.util.Map;

public class Animal implements Vaccinateable, Treatable {

    private Map<Disease, Boolean> isVaccinated;
    private boolean isClean;
    private int age;
    private String name;
    private int animalNumber;

    public Animal() {
    }

    public Animal(boolean isClean, int age, String name, int animalNumber) {
        this.isClean = isClean;
        this.age = age;
        this.name = name;
        this.animalNumber = animalNumber;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getAnimalNumber() {
        return animalNumber;
    }

    @Override
    public void treatAnimal() {
        isClean = true;
    }

    @Override
    public void vaccinateAnimal(Disease nameOfDisease) {
        Map<Disease, Boolean> isVaccinated;
    }
}
