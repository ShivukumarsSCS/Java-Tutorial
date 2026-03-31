class OverloadingExample {

    // method with 1 parameter
    void add(int a) {
        System.out.println("One number: " + a);
    }

    // method with 2 parameters
    void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    // method with different data type
    void add(double a, double b) {
        System.out.println("Double sum: " + (a + b));
    }

    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();

        obj.add(5);
        obj.add(5, 10);
        obj.add(2.5, 3.5);
    }
}
