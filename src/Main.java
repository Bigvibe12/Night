public class Main {
    public static void main(String[] args) {

        Product product = new Product("Laptop", "Electronics", 2200.0, 15);
        Vehicle vehicle = new Vehicle("Toyota", "Car", "Corolla", 2021);
        Student student = new Student("John Doe", "University Student", "U12345", 3.8);

        product.displayDetails();
        vehicle.displayDetails();
        student.displayDetails();

        System.out.println("\n=== COMPUTED VALUES ===");
        System.out.println("Product Computed Value: " + product.computeValue(5));
        System.out.println("Vehicle Computed Value: " + vehicle.computeValue(8));
        System.out.println("Student Computed Value: " + student.computeValue(12));
    }
}
