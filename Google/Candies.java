import java.util.Scanner;
// import java.util.Arrays;
class Candies {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // initialize sum = 0
        int sum = 0;
        // initializing i = 0
        int i = 0;
        int M = 0;

        int remains = 0;
        int distributed = 0;
        int divideCandies = 0;

        // input the no. of testcases
        int testCases = scan.nextInt();
        int k = 1;
        while (testCases-- > 0) {
            // input the no. of bags
            int N = scan.nextInt();

            // input the no. of kids
            M = scan.nextInt();

            // storing candies as the input in an array
            int[] candies = new int[N];
            for(i = 0; i < N; i++) {
                candies[i] = scan.nextInt();
            }
            for(i = 0; i < candies.length; i++) {
                sum += candies[i];
            }

            // System.out.println(sum);

            divideCandies = sum/M;
            distributed = divideCandies * M;
            remains = sum - distributed;
        
            System.out.println("Case #" + k++ + ": " + remains);
            
            sum = 0;
        }
    }
}