// 1. WAP TO FIND THE LARGEST ELEMENT FROM THE ARRAY IN JAVA.

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 10, 50, 22, 12, 8, 14, 89, 29, 24};

        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("The largest element in the array is : " + largest);
    }
}
