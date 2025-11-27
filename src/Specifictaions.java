class Specifictaions extends Vehicle {
    private final double speed;

    public Specifictaions(double speed) {
        super("V123", "Car");
        this.speed = speed;
    }

    @Override
    public void displayDetails() {
        System.out.println("Speed: " + speed);
        System.out.println("Name: " + name);
    }

    @Override
    public double computeValue(double fuel) {
        return fuel * speed;
    }
}
