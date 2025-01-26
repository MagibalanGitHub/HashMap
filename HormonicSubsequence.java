import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HormonicSubsequence {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=in.nextInt();
        }
        HashMap<Integer,Integer> set=new HashMap<>();
        for(int num:arr){
            set.put(num,set.getOrDefault(num,0)+1);
        }
        System.out.println(set);
        int max=0;
        for(Map.Entry<Integer,Integer> entry:set.entrySet()){
            int count=0;
            if(set.containsKey(entry.getKey()+1)){
                count=entry.getValue()+set.get(entry.getKey()+1);
                max=Math.max(count,max);
            }
        }
        System.out.println("The Larget Hormonic Subsequence is : "+max);
    }
}
