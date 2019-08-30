import java.util.ArrayList;
import java.util.Arrays;

public class GivenInteger {
    public static void array(ArrayList<Integer> arr){
        ArrayList<Integer> diffrence =new ArrayList<Integer>();
        for (int i=arr.size()-1; i>=0;i--){
            for(int j=arr.size()-1;j>=0;j--){


                  diffrence.add( Math.abs(arr.get(i)-arr.get(j)));
            if(j!=0){
                diffrence.add(Math.abs(diffrence.get(i)-diffrence.get(i-1)));
            }
              }
            }
            System.out.println(diffrence);

        }



    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(2,4,6));
        array(arr);
    }
}
