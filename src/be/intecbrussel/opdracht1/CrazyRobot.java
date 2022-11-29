package be.intecbrussel.opdracht1;

public class CrazyRobot extends Robot {

    public CrazyRobot() {

    }

    public CrazyRobot(String unitName) {
        super(unitName);
    }

    public void boot() {
        String name = getUnitName();
        String revOrder = "";
        for (int index = getUnitName().length() - 1 ; index >= 0; index--) {
            revOrder += name.charAt(index);
        }
        System.out.println(revOrder);
    }
}
