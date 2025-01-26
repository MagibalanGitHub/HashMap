import java.util.HashMap;

public class Hash {
    public static void main(String[] args) {
        HashMap<Integer,String>map=new HashMap<>();
        map.put(1,"magi");
        map.put(2,"dhaanush");
        map.put(3,"rithik");
        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println(map.remove(1));

        for(int a:map.keySet()){
            System.out.println(a+" : "+map.get(a));
        }

        String ar="apple,banana,apple,banana,apple,banana";
        String arr[]=ar.split(",");
        HashMap<String,Integer>map1=new HashMap<>();
        for(String word:arr){
            map1.put(word,map1.getOrDefault(word,0)+1);
        }
        for(String wr:map1.keySet()){
            System.out.println( wr +" = "+map1.get(wr));
        }
    }
}
