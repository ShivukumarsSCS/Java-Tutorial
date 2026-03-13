import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first character:");
        char a = sc.next().charAt(0);
        System.out.println("Enter second character:");
        char b = sc.next().charAt(0);
        System.out.println("First character: " + a);
        System.out.println("Second character: " + b);
    }
}
