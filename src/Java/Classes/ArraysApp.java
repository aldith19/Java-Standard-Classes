package Java.Classes;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {

        int[] number ={1,3,4,2,7,66,32,12,90,11,9,5,4,6,3,56};

        Arrays.sort(number);
        System.out.println(Arrays.toString(number));

        System.out.println(Arrays.binarySearch(number,7));
        System.out.println(Arrays.binarySearch(number,3));

        int[] result = Arrays.copyOf(number,5);
        System.out.println(Arrays.toString(result));

        int[] result1 = Arrays.copyOfRange(number,5,9);
        System.out.println(Arrays.toString(result1));
    }
}
