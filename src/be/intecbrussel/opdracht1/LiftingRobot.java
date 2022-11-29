package be.intecbrussel.opdracht1;

public class LiftingRobot extends Robot {

    private double maxLiftHeight;

    public LiftingRobot(String unitName, double maxLiftHeight) {
        super(unitName);
        this.maxLiftHeight = maxLiftHeight;
    }

    public void lift(double liftHeight) {
        if (liftHeight > maxLiftHeight) {
            System.out.println("lifting impossible, greater than maxLiftHeight: " + maxLiftHeight);
        } else {
            System.out.println("robot lifted, height: " + liftHeight);
        }
    }

    @Override
    public String toString() {
        return "LiftingRobot{" +
                "maxLiftHeight=" + maxLiftHeight +
                '}';
    }
}
