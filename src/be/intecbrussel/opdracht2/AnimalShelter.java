package be.intecbrussel.opdracht2;

import java.util.*;
import java.util.function.Predicate;

public class AnimalShelter {

    private List<Animal> animals = new ArrayList<>();

    private int animalId;

    public AnimalShelter() {
    }

    public AnimalShelter(int animalId) {
        this.animalId = animalId;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
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

    public void printAnimalsNotVaccinatedForGivenDisease(Disease nameDisease) {
        for (Animal myAnimal : animals) {
            if (myAnimal.getIsVaccinated().get(nameDisease) == false) {
                System.out.println(myAnimal);
            }
        }
    }

    public Optional<Animal> findAnimal(int number) {
        for (Animal myAnimal : animals) {
            if (number == myAnimal.getAnimalNumber()) {
                return Optional.of(myAnimal);
            }
        }
        return Optional.empty();
    }

    public Optional<Animal> findAnimal(String name) {
        for (Animal myAnimal : animals) {
            if (myAnimal.getName().equals(name)) {
                return Optional.of(myAnimal);
            }
        }
        return Optional.empty();
    }

    public void treatAnimal(int number) {
        for (Animal animalNum : animals) {
            if (animalNum.getAnimalNumber() == number) {
                animalNum.treatAnimal();
            }
        }
    }

    public void treatAnimal(String name) {
        for (Animal animalName : animals) {
            if (animalName.getName().equals(name)) {
                animalName.treatAnimal();
            }
        }
    }

    public void treatAllAnimals() {
        for (Animal allAnimal : animals) {
            allAnimal.treatAnimal();
        }
    }

    public Animal findOldestAnimal() {
        animals.sort(Comparator.comparingInt(Animal::getAge).reversed());
        return animals.get(0);
    }

    public int countAnimals() {
        return animals.size();
    }

    @Override
    public String toString() {
        return "AnimalShelter{" +
                "animals=" + animals +
                ", animalId=" + animalId +
                '}';
    }
}
