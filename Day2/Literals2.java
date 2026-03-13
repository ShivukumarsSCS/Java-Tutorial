import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        float a = sc.nextFloat();
        System.out.println("Enter second number:");
        float b = sc.nextFloat();
         float sum = a + b;
         System.out.println("Sum is: " + sum);
    }
}
