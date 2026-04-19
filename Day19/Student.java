class Student {
    String name;
    int marks;
    Student(String n, int m) {
        name = n;
        marks = m;
    }
    void display() {
        System.out.println("Name = " + name);
        System.out.println("Marks = " + marks);
    }
}
class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Shivu", 85);
        Student s2 = new Student("Ravi", 90);

        s1.display();
        System.out.println();
        s2.display();
    }
}
