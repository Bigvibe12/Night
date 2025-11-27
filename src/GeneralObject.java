// Abstract base class
abstract class GeneralObject {
    protected String name;       // Common attribute
    protected String category;   // Common attribute

    // Constructor to initialize common attributes
    public GeneralObject(String name, String category) {
        this.name = name;
        this.category = category;
    }

    // Abstract method - must be implemented by subclasses
    public abstract void displayDetails();

    // Concrete method - performs a numerical computation
    public double computeValue(double factor) {
        return factor * 10;  // Simple calculation for demonstration
    }
}
