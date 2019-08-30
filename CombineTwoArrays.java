import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoArrays {
    public static void combine (ArrayList<Integer> arr1, ArrayList<Integer> arr2){
        ArrayList<Integer> arr =new ArrayList<>();
        int counter=0;
        for (int i=0;i<arr1.size()+arr2.size(); i++){
            if(i< arr1.size()){
                arr.add(arr1.get(i));
            }
            else {
                arr.add(arr2.get(counter));
            counter++;
            }
        }
        System.out.println(arr);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
        ArrayList<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(7,8,9,10,11,12,13));
        combine(arr1,arr2);
    }
}
