import java.util.List;
import java.util.*;

class MyArrayList {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        // userInput
        List<Integer> list = new ArrayList<>();
        System.out.print("Enter Array Elements: ");
        int num = scan.nextInt();
        for(int i = 0; i < num; i++) {
            list.add(scan.nextInt());
        }

        // Logic 
        List<Integer> outputList = new ArrayList<>();
        int n = list.size() - 1;
        while(n >= 0) {
            outputList.add(list.get(n));
            n--;
        }
        System.out.println(outputList);
    }
}