package notation;

import java.util.Arrays;

public class Main {
    public static char[] convert(int number, int radix) {
        int n = number;
        int i = 0;
        char[] result = {};
        String base = "0123456789ABCEFGH";

        while (n > 0) {
            result = Arrays.copyOf(result, ++i);
            result[i-1] = base.charAt(n%radix);
            n /= radix;
        }

        swap(result);

        return result;
    }

    private static void swap(char[] array) {
        for (int j = 0; j < array.length/2; j++) {
            char temp = array[j];
            array[j] = array[array.length-j-1];
            array[array.length-j-1] = temp;
        }
    }
}
