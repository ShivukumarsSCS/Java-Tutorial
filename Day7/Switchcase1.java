import java.util.Scanner;

class Switchcase {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age");
        
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();  
        
        switch(age) {
            case 18:
                System.out.println("You are going to be an Adult");
                break;
                
            case 30:
                System.out.println("You are going to join a job");
                break;
                
            case 60:
                System.out.println("You are going to get retired");
                break;
                
            default:
                System.out.println("Enjoy your life");
        }
        
        sc.close(); 
    }
}
