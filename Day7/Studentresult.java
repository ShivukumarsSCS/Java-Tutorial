import java.util.Scanner;

class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of Subject 1: ");
        int s1 = sc.nextInt();
        System.out.print("Enter marks of Subject 2: ");
        int s2 = sc.nextInt();
        System.out.print("Enter marks of Subject 3: ");
        int s3 = sc.nextInt();
        int total = s1 + s2 + s3;
        float percentage = total / 3.0f;
        int result;
        if (percentage >= 40 && s1 >= 33 && s2 >= 33 && s3 >= 33) {
            result = 1;
        } else {
            result = 0;
        }
        switch(result) {
            case 1:
                System.out.println("Student Pass");
                break;

            case 0:
                System.out.println("Student Fail");
                break;

            default:
                System.out.println("Invalid Result");
        }
        sc.close();
    }
}
