import java.util.Scanner;

class SearchElement {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int key;
        boolean found = false;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        key = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element is present in the array.");
        } else {
            System.out.println("Element is NOT present in the array.");
        }
    }
}
