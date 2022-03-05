import java.util.Scanner;
import java.util.Arrays;

class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();

        int[] array = getArray(n);
        System.out.println(Arrays.toString(reverse(array)));
        // int[] array = new int[n];
        // System.out.println(Arrays.toString(array));
        
    }

    private static int[] getArray(int n) {
        int[] array = new int[n];
        for(int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        return array;
    }


    private static int[] reverse(int[] array) {
        int[] result = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            result[i] = array[array.length - 1 - i];
        }
        return result;
    }
}