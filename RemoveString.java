import java.util.ArrayList;
import java.util.Arrays;

public class RemoveString {
    public static boolean checkArray(String str){
        boolean check=false;
        for (int i=0; i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'){
                check=true;

            }
        }
        return check;
    }
    public static void printWithoutAEI(ArrayList<String> arr){
        for (String str:arr){
            if (!checkArray(str)){
                System.out.println(str);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<String> myArr =new ArrayList<String >(Arrays.asList("abc","def","ghl"));
        printWithoutAEI(myArr);
    }
}
