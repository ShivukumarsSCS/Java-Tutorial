class FloatArraySum {
    public static void main(String[] args) {
        float[] numbers = {1.5f, 2.5f, 3.0f, 4.2f, 5.8f};
        float sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of array elements: " + sum);
    }
}
