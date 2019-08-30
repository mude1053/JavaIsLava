import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDublicate {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<String>(Arrays.asList("Aslan","Kaplan","Ceylan"));
   String[] returnedFromArrayList = returnAsArray(arr);
        System.out.println(Arrays.toString(returnedFromArrayList));
        Object[] objects =arr.toArray();

        for(Object str: objects){
            System.out.println(str);
        }
    }
    public static String[] returnAsArray(ArrayList<String> arr){
        String[] myStrArr=new String[arr.size()];
        for (int i=0; i<arr.size();i++){
           myStrArr[i] = arr.get(i);
        }
        return myStrArr;
    }

}
