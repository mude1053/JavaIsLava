import java.util.HashMap;

public class AdjacentMultip {
    public static void main(String[] args) {
        int[] myArr= {1,2,3,5,2,4};
        adjacent(myArr);
    }

    public static void adjacent(int[] arr) {
        HashMap<Integer, String> hasmet = new HashMap<>();
        int multiplication=1;
        int temp ;

        for (int i = 0; i < arr.length - 1; i++) {
            multiplication = arr[i] * arr[i + 1];
            temp=i+1;
            hasmet.put(multiplication, " index: " + i + " value: " + arr[i] + " index: " + temp + " value: " + arr[i + 1]);

        }
        int max=multiplication;
        for (int key:hasmet.keySet()){
           // System.out.println("key: "+key+hasmet.get(key));
            if (key>max){
                max=key;
            }
        }
        System.out.println(hasmet.get(max)+" "+max);
    }

}
