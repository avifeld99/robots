package be.intecbrussel.opdracht2;

public class AnimalApp {
    public static void main(String[] args) {

        Animal monkey01 = new Monkey(false, 3, "Jef01", 45, false);
        Animal monkey02 = new Monkey(false, 4, "Jef02", 46, true);

        monkey01.vaccinateAnimal(Disease.FLUE);

        AnimalShelter shelter = new AnimalShelter();
        shelter.addAnimal(monkey01);
        shelter.addAnimal(monkey02);

        Animal oldest = shelter.findOldestAnimal();
        System.out.println(oldest);
    }
}
