package be.intecbrussel.opdracht2;

public class Monkey extends Animal {

    private boolean isHyperActive;

    public Monkey() {
    }

    public Monkey(boolean isClean, int age, String name, int animalNumber, boolean isHyperActive) {
        super(isClean, age, name, animalNumber);
        this.isHyperActive = isHyperActive;
    }

    @Override
    public String toString() {
        return "Monkey{" +
                super.toString() +
                "isHyperActive=" + isHyperActive +
                '}';
    }
}
