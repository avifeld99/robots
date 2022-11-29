package be.intecbrussel.opdracht2;

import java.util.Comparator;
import java.util.List;

public class AnimalShelter {

    private List<Animal> animals;
    private int animalId;

    public AnimalShelter() {
    }

    public AnimalShelter(int animalId) {
        this.animalId = animalId;
    }

    public void printAnimals() {
        System.out.println(animals);
    }

    public void sortAnimals() {
        Comparator<Animal> sortByNumber =
                (animal1, animal2) -> Integer.compare(animal1.getAnimalNumber(), animal2.getAnimalNumber());
    }

    public void sortAnimalsByName() {
        Comparator<Animal> sortByName =
                (animal1, animal2) -> animal1.getName().compareTo(animal2.getName());
    }

    public void sortAnimalsByAge() {
        Comparator<Animal> sortByAge =
                (animal1, animal2) -> Integer.compare(animal1.getAge(), animal2.getAge());

    }

    public void printAnimalsNotVaccinated(Disease nameDisease) {

    }

    public Animal findAnimal(int findByNumber) {
        return null;
    }

    public Animal findAnimal(String findByName) {
        return null;
    }

    public void treatAnimal(int findByNumber) {

    }

    public void treatAnimal(String findByName) {

    }

    public void treatAllAnimals() {

    }

    public Animal findOldestAnimal() {
        return null;
    }

    public int countAnimals() {
        return 0;
    }

}
