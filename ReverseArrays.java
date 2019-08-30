import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrays {
    public static void main(String[] args) {
        ArrayList <Integer> myArr= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
       arrayReverse(myArr);
    }

    public static void arrayReverse(ArrayList<Integer> arr){
    int temp;
        for (int i=0;i<arr.size()/2;i++){
            temp= arr.get(i);
            arr.set(i,arr.get(arr.size()-1-i));
            arr.set(arr.size()-1-i,temp);
        }
        System.out.println(arr);

    }

}
