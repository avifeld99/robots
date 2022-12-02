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
        setIsVaccinated(isVaccinated);
        this.isClean = isClean;
        this.age = age;
        this.name = name;
        this.animalNumber = animalNumber;
    }

    public void setIsVaccinated(Map<Disease, Boolean> isVaccinated) {
        for (Disease disease : Disease.values()) {
            this.isVaccinated.put(disease, false);
        }
        this.isVaccinated = isVaccinated;
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

    @Override
    public void treatAnimal() {
        isClean = true;
    }

    @Override
    public void vaccinateAnimal(Disease nameOfDisease) {
        isVaccinated.put(nameOfDisease, true);
        //System.out.println(isVaccinated);
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
