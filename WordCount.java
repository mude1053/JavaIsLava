import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        System.out.println(removeExtraSpaces(" Armamadigim      yer kalmadi seni sabahtan yatana kadar!!"));
        countWords(" Armamadigim        yer kalmadi seni kalmadi sabahtan yatana kadar ! !");
    }
    public static String removeExtraSpaces(String str){
        String filtered ="";
        char[] charArray=str.toCharArray();
        for (int i=0; i<str.length()-1;i++){
            if (!(str.charAt(i)==' '&& str.charAt(i+1)==' ')){
                filtered=filtered+str.charAt(i);
            }
            if (str.charAt(str.length())!=' '){
                filtered=filtered+str.charAt(str.length()-1);
            }
        }
        return filtered;
    }
    public static void countWords(String sentence){
        sentence=removeExtraSpaces(sentence);
        String[] words= sentence.split(" ");
        HashMap<String,Integer> wordCount= new HashMap<>();
        int count=0;
        for (int i=0; i<words.length;i++){
            for (int j=0; j<words.length;j++){
                if (words[i].equals(words[j])){

                    count++;
                }

            }if (count>0) {
                wordCount.put(words[i], count);
            }
            count=0;
        }
        System.out.println(wordCount);

    }
}
