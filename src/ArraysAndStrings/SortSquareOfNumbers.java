package ArraysAndStrings;

import java.util.Arrays;

public class SortSquareOfNumbers {

    public static void main(String[] args) {
        int[] number = { -2, -3, -4, 5, 6, 4 };

        for (int i = 0; i < number.length; i++) {
            number[i] = number[i] * number[i];
        }

        Arrays.sort(number);

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
            ;
        }

    }
}
