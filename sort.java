import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class sort {
    public static String sortOfArray(String str){
        String newStr="";
        for (int i=str.length()-1; i>=0;i--){
           newStr=newStr+ str.charAt(i);
        }
        return newStr;
    }
    public static void  reverseArrayList(ArrayList<String > arr){
        ArrayList<String > reversed = new ArrayList<String>();
        for (int i=arr.size()-1;i>=0;i--){
            reversed.add(sortOfArray(arr.get(i)));
        }
        System.out.println(reversed);;
    }

    public static void main(String[] args) {
        ArrayList<String> myArr =new ArrayList<String>(Arrays.asList("abc","def","ghi"));
        reverseArrayList(myArr);
    }
}
