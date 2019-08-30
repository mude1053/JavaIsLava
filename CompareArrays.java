import java.util.ArrayList;
import java.util.Arrays;

public class CompareArrays {
    public static void main(String[] args) {
        ArrayList<Integer> arr1= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> arr2=new ArrayList<>(Arrays.asList(1,2,3,4,6));
        System.out.println( arrays(arr1,arr2));
    }

    public static boolean arrays(ArrayList<Integer> arr1,ArrayList<Integer> arr2){
       boolean equal=true;
        if (arr1.size()!=arr2.size()){
           return false;
       }
       else {
           for (int i=0;i<arr1.size();i++){
              if(!arr2.contains(arr1.get(i))){
                  return false;

              }
           }
       }
       return equal;
    }
}
