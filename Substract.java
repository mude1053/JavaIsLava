import java.util.ArrayList;
import java.util.Arrays;

public class Substract {
    public static void array(ArrayList<Integer> arr){
        ArrayList<Integer> firstDerivation=new ArrayList<Integer>();
        for (int i=1; i<arr.size();i++){
            firstDerivation.add(Math.abs(arr.get(i-1)-arr.get(i)));
        }
        System.out.println(firstDerivation);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(3,2,8,5));
        array(arr);
    }
}
