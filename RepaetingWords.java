import java.util.HashMap;

public class RepaetingWords {
    public static void main(String[] args) {
        String arr="the best way to understand java is the practice java using java";
        repeatWord(arr);
    }
    public static void repeatWord(String  word){
        HashMap<String ,Integer > myHas=new HashMap<String, Integer>();
       String[] arr1 =word.split(" ");
        int counter=0;

        for (int i=0;i<arr1.length;i++){
            for (int j=0; j<arr1.length;j++){

                if (arr1[i].equals(arr1[j])){
                    counter++;
                }
            }
            myHas.put(arr1[i],counter);
            counter=0;
        }
        System.out.println(myHas);
    }
}
