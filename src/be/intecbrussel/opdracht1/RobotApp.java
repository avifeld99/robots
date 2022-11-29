package be.intecbrussel.opdracht1;

public class RobotApp {
    public static void main(String[] args) {

        BendingRobot bendingRobot = new BendingRobot("Benny", 360);
        bendingRobot.bend(450.9);
        bendingRobot.bend(90);

        LiftingRobot liftingRobot = new LiftingRobot("Liffy", 10);
        liftingRobot.lift(12.9);
        liftingRobot.lift(6.3);

        CrazyRobot crazyRobot = new CrazyRobot("crazy");
        crazyRobot.boot();
    }
}