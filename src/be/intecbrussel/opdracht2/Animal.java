package be.intecbrussel.opdracht2;

import java.util.HashMap;
import java.util.Map;

public class Animal implements Vaccinateable, Treatable {

    private Map<Disease, Boolean> isVaccinated = new HashMap<>();

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

    public Map<Disease, Boolean> getIsVaccinated() {
        return isVaccinated;
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

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnimalNumber(int animalNumber) {
        this.animalNumber = animalNumber;
    }

    @Override
    public void treatAnimal() {
        isClean = true;
    }

    @Override
    public void vaccinateAnimal(Disease nameOfDisease) {
        isVaccinated.put(nameOfDisease, true);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "isVaccinated=" + isVaccinated +
                ", isClean=" + isClean +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", animalNumber=" + animalNumber +
                '}';
    }
}
