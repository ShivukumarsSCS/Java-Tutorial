class SimpleOverload {
    void show(int a) {
        System.out.println("Integer: " + a);
    }
    void show(double a) {
        System.out.println("Double: " + a);
    }
    public static void main(String[] args) {
        SimpleOverload obj = new SimpleOverload();

        obj.show(10);
        obj.show(5.5);
    }
}
