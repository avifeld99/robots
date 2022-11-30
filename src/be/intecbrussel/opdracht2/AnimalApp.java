package be.intecbrussel.opdracht2;

import java.util.Optional;

public class AnimalApp {
    public static void main(String[] args) {

        Animal monkey01 = new Monkey(false, 3, "Jef01", 45, false);
        Animal monkey02 = new Monkey(false, 4, "Jef02", 46, true);
        Animal dog01 = new Dog(false, 8, "Jef03", 87, true);
        Animal cat01 = new Cat(false, 5, "Jef04", 98, true);

        //System.out.println(monkey01.getIsVaccinated());
        monkey01.vaccinateAnimal(Disease.FLUE);
        //System.out.println(monkey01.getIsVaccinated());

        AnimalShelter shelter = new AnimalShelter();
        shelter.addAnimal(monkey01);
        shelter.addAnimal(monkey02);
        shelter.addAnimal(dog01);
        shelter.addAnimal(cat01);

        shelter.printAnimalsNotVaccinatedForGivenDisease(Disease.FLUE);

        /*Optional<Animal> findAn = shelter.findAnimal("dfgv");
        System.out.println(findAn);

        shelter.treatAnimal(45);
        System.out.println(shelter);

        Animal oldest = shelter.findOldestAnimal();
        System.out.println("The oldest animal of the shelter: " + oldest);*/
    }
}
