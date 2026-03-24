import java.util.Arrays;
class Arraysort {
    public static void main(String[] args) {
        int[] marks = {90, 45, 78, 30, 50};
        Arrays.sort(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
