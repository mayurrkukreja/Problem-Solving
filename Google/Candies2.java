import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        // int k = 1;
        while(testCases-- > 0 ) {
            int N = scan.nextInt();
            int M = scan.nextInt();
            int[] C = new int[N];
    
            for(int i = 0; i < N; i++) {
                C[i] = scan.nextInt();
            }
    
            new Solution();
            // System.out.print("Case #" + k++ + ": ");
            Solution.solve(N, M, C);
            
        }
        scan.close();
    }
}

class Solution {
    public static int solve(int N, int M, int[] C) {
        int total = 0;
        for(int i = 0; i < N; i++) {
            total = total + C[i];
        }
        // System.out.println(total);

        int remainder = total % M;
        System.out.println(remainder);
        return remainder;
    }
}