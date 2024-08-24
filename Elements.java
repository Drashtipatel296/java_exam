// 2. WAP TO SORT ARRAY IN ASCENDING(LOW TO HIGH) ORDER IN JAVA.

import java.util.Arrays;

public class Elements {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 5, 25, 30, 15};

        Arrays.sort(numbers);

        System.out.println("Array in ascending order: " + Arrays.toString(numbers));
    }
}
