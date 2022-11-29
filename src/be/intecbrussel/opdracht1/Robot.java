package be.intecbrussel.opdracht1;

public abstract class Robot {

    private String unitName;

    public Robot() {
        this.unitName = "nameless robot";
    }

    public Robot(String unitName) {
        this.unitName = unitName;
    }

    public void boot() {
        System.out.println("robot: " + unitName + " - is activated");
    }

    public String getUnitName() {
        return unitName;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "unitName='" + unitName + '\'' +
                '}';
    }
}
