import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of temp: ");
        int temp = scan.nextInt();
        
        System.out.print("Enter the value of n: ");
        
        while(temp-- > 0) {
            int n = scan.nextInt();
            int arr[] = new int[n];

            for(int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            new Solution();
            Solution.print(arr, n);
            System.out.println();
        }
    }
}

class Solution {
    public static void print(int arr[], int n) {
        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
