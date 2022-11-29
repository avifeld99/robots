package be.intecbrussel.opdracht2;

public class Dog extends Animal {

    private boolean hasFoulBreath;

    public Dog() {
    }

    public Dog(boolean isClean, int age, String name, int animalNumber, boolean hasFoulBreath) {
        super(isClean, age, name, animalNumber);
        this.hasFoulBreath = hasFoulBreath;
    }
}
