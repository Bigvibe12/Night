class Student extends GeneralObject {
    private String studentId;   // Unique attribute
    private double gpa;         // Unique attribute

    public Student(String name, String category, String studentId, double gpa) {
        super(name, category);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    @Override
    public void displayDetails() {
        System.out.println("=== STUDENT DETAILS ===");
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Student ID: " + studentId);
        System.out.println("GPA: " + gpa);
    }
}
