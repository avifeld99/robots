package be.intecbrussel.opdracht1;

public class BendingRobot extends Robot {

    private double maxBendAngle;

    public BendingRobot(String unitName, double maxBendAngle) {
        super(unitName);
        this.maxBendAngle = maxBendAngle;
    }

    public void bend(double bendAngle) {
        if (bendAngle > maxBendAngle) {
            System.out.println("bending impossible, greater than maxBendAngle: " + maxBendAngle);
        } else {
            System.out.println("angle bent, angle: " + bendAngle);
        }
    }

    @Override
    public String toString() {
        return "BendingRobot{" +
                "maxBendAngle=" + maxBendAngle +
                '}';
    }
}

//hou rekening met het feit dat 360° == 0°???
