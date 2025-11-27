class Product extends GeneralObject {
    private double price;         // Unique attribute
    private int stockQuantity;    // Unique attribute

    public Product(String name, String category, double price, int stockQuantity) {
        super(name, category);
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    @Override
    public void displayDetails() {
        System.out.println("=== PRODUCT DETAILS ===");
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
        System.out.println("Stock Quantity: " + stockQuantity);
    }
}
