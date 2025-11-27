class Vehicle extends GeneralObject {
    private String model;      // Unique attribute
    private int year;          // Unique attribute

    public Vehicle(String name, String category, String model, int year) {
        super(name, category);
        this.model = model;
        this.year = year;
    }

    @Override
    public void displayDetails() {
        System.out.println("=== VEHICLE DETAILS ===");
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}
