import java.util.HashMap;
import java.util.Scanner;

public class ContainsDuplicate_II {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=in.nextInt();
        }
        int k=in.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a;i++){
            if(map.containsKey(arr[i])){
                int prev=map.get(arr[i]);
                if(i-prev<=k){
                    System.out.println("True");
                    return ;
                }

            }
            map.put(arr[i],i);
        }
        System.out.println("False");
    }
}
