import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class NewArray {
    public static void main(String[] args) {

        ArrayList<Integer> myArr = new ArrayList<Integer>(Arrays.asList(1, 2, 3,3, 4, 5, 3, 6, 7));
        for (int i=0;i<myArr.size();i++){
            if(!myArr.contains(i)){

            }
        }


        ArrayList<Integer> arr = new ArrayList<Integer>();
        double rand;
        for (int i = 0; i < 101; i++) {
            rand = Math.random() * 1001;
            arr.add((int) rand);
        }
        Collections.sort(arr);
        System.out.println(arr);
        System.out.println(arr.get(arr.size() - 1));
        System.out.println(arr.get(arr.size() / 2));
        for (int i = arr.size() - 4; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(arr.get(i));
        }


    }
}










