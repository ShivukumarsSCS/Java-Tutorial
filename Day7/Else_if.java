import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        if (age > 56) {
            System.out.println("You are experienced!");
        } else if (age > 30) {
            System.out.println("You are semi-experienced!");
        } else {
            System.out.println("You are not experienced!");
        }

        sc.close();
    }
}
