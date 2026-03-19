import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        int category;
        if (age > 56) {
            category = 1;
        } else if (age > 30) {
            category = 2;
        } else {
            category = 3;
        }
        switch (category) {
            case 1:
                System.out.println("You are experienced!");
                break;
            case 2:
                System.out.println("You are semi-experienced!");
                break;
            case 3:
                System.out.println("You are not experienced!");
                break;
            default:
                System.out.println("Invalid input");
        }

        sc.close();
    }
}
