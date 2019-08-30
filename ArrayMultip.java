import java.util.ArrayList;
import java.util.Arrays;

public class ArrayMultip {
    public static void main(String[] args) {
       ArrayList<Integer> arr1= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
       ArrayList<Integer> arr2=new ArrayList<>(Arrays.asList(1,2,3));

        arrays(arr1,arr2);
    }
    public static void arrays(ArrayList<Integer> arr1,ArrayList<Integer>arr2){
      int[]arr;
        for (int i=0; i<arr1.size();i++ ){
            if(arr2.size()<arr1.size()){
                for (int j=0; j<arr2.size();j++){
                    System.out.println(arr1.get(i)*
                            arr2.get(j));
                }

            }


        }


    }
}
