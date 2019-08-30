import java.util.ArrayList;
import java.util.Arrays;
import java.util.jar.Attributes;

public class ShiftLeftNumbers {
    public static void shift(ArrayList<Integer> arr, int left){


        for (int i=0; i<left;i++){

    arr.remove(0);
        }
        System.out.println(arr);
    }

    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<Integer> (Arrays.asList(1, 2, 3, 4, 6, 7));
        shift(array,5);
        System.out.println('a'+'b');
        int $_=5;
    }

}
