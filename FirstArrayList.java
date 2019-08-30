import java.util.ArrayList;
import java.util.Iterator;

public class FirstArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> myFirst = new ArrayList<Integer>();


        for(int i =0; i<=1000;i++){
            myFirst.add(i);
        }
        System.out.println(myFirst);
        System.out.println(myFirst.get(0));
        printElementsOfAttayList(myFirst);
    }
    public static void printElementsOfAttayList (ArrayList<Integer> arr){
        for(int i:arr){
            System.out.println(i);
        }
    }
    public static void printWithIterator(ArrayList<Integer> arr){
        Iterator myIter = arr.iterator();
        while (myIter.hasNext()){
            System.out.println(myIter.next());
        }
    }
}
