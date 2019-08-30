import java.util.ArrayList;
import java.util.Arrays;

public class CutHalfArray {
    public static void main(String[] args) {
        ArrayList<Integer> myarr= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
       halfArray(myarr);
        cutHalf(myarr);
    }

    public static void halfArray(ArrayList<Integer> arr){
     ArrayList<Integer> arr1=new ArrayList<>();
     ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i=0; i<arr.size(); i++){
          if (i<arr.size()/2){
              arr1.add(arr.get(i));
          }
          else{
              arr2.add(arr.get(i));
          }
        }
        System.out.println(arr1);
        System.out.println(arr2);
    }
    public static void cutHalf(ArrayList<Integer> arr){

        ArrayList<Integer> arr1 = new ArrayList<>();

        ArrayList<Integer> arr2 = new ArrayList<>();

        for(int i=0 ; i<arr.size() ; i++){

            if(i<arr.size()/2){

                arr1.add(arr.get(i));

            }

            else {

                arr2.add(arr.get(i));

            }

        }

        System.out.println(arr1);

        System.out.println(arr2);

    }

}
