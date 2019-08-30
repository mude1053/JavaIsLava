import java.util.ArrayList;
import java.util.Arrays;

public class SameDiffrence {
    public static void findSameDiffrences(ArrayList<Integer>arr) {
        int counter = 0;
        ArrayList<Integer> diffrences = new ArrayList<Integer>();
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                if (i != j) {
                    diffrences.add(Math.abs(arr.get(i) - arr.get(j)));

                }
            }
        }
        System.out.println(diffrences);


    }

    public static void main(String[] args) {
        ArrayList<Integer> myArr =new ArrayList<Integer>(Arrays.asList(2,3,4,6,8));
        findSameDiffrences(myArr);
    }
}
