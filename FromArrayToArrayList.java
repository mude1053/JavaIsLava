import java.util.ArrayList;

public class FromArrayToArrayList{
    public static void convertArrayToArrayList (int[] arr){
        ArrayList<Integer> myArr = new ArrayList<Integer>();

        for(int number:arr){

            myArr.add(number);

        }

        System.out.println(myArr);

    }


    public static void main(String[] args) {

        int[] myArr = new int[50];

        int index=0;

        for(int i=1 ; i<101 ; i=i+2){

            myArr[index]=i;

            index++;

        }

        convertArrayToArrayList(myArr);

    }

}
