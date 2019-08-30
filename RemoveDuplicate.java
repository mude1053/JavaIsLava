import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<String> arr= new ArrayList<String > (Arrays.asList("new jersey", "new York", "new jersey", "karalar", "Angara"));
        removeDuplicateString(arr);


        }
public static void removeDuplicateString(ArrayList<String > arr){
    ArrayList<String> myArr = new ArrayList<String>();
    for (String letter:arr){
        if (!myArr.contains(letter)){
            myArr.add(letter);

        }
}
    System.out.println(myArr);

}}
