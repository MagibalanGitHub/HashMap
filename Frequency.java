import java.util.HashMap;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = in.nextInt();
        }
        HashMap<Integer, Integer> set = new HashMap<>();
        for (int num : arr) {
            set.put(num, set.getOrDefault(num, 0) + 1);
        }
        for (int num : set.keySet()) {
            System.out.println("The frequence of "+num+" is "+set.get(num));
        }
    }
}
