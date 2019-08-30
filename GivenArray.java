import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GivenArray {
    public static void main(String[] args) {
int[] arr={1,2,2,2,3,3};
     arrayCount(arr);

    }
    public static void arrayCount(int [] arr){
        HashMap<Integer,Integer> occurs=new HashMap<Integer, Integer>();
       int count=0;

        for (int i=0; i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    count++;
                }
            }
            occurs.put(arr[i],count);
            count=0;
        }

        System.out.println(occurs);


    }
}
