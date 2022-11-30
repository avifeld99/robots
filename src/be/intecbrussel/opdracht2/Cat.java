package be.intecbrussel.opdracht2;

public class Cat extends Animal {

    private boolean hasLongNails;

    public Cat() {
    }

    public Cat(boolean isClean, int age, String name, int animalNumber, boolean hasLongNails) {
        super(isClean, age, name, animalNumber);
        this.hasLongNails = hasLongNails;
    }

    @Override
    public String toString() {
        return "Cat{" +
                super.toString() +
                "hasLongNails=" + hasLongNails +
                '}';
    }
}
