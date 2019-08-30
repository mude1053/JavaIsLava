import java.util.ArrayList;
import java.util.Arrays;

public class ArraysReverse {
    public static void main(String[] args) {
        ArrayList<String > myArr = new ArrayList<String >(Arrays.asList("abc","def","ghi"));
        arraysRemove(myArr,"abc");
    }
    public static void arraysRemove(ArrayList<String> arr,String str){
        int index = arr.indexOf(str);
        arr.remove(index);
        System.out.println(arr);
        }

    }

