abstract public class Vehicle {
    protected String id;
    protected String name;

    public Vehicle(String id, String name) {
        this.id = id;
        this.name = name;
    }
    abstract public void displayDetails();

    public double computeValue(double fuel) {
        return fuel * fuel;
    }
}
