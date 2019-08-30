import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListFena {
    public static void main(String[] args) {
        ArrayList<String> myArr= new ArrayList<String>(Arrays.asList("A","B","C","D"));
        myArr.add("E");
        myArr.remove(0);
        System.out.println(myArr);
        System.out.println();

    }
}
