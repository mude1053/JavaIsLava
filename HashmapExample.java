import java.util.HashMap;

public class HashmapExample {
    public static void main(String[] args) {
        HashMap<String,String > myHash=new HashMap<String ,String>();
        myHash.put("England","Londan");
        myHash.put("Russia","Moscow");
        myHash.put("Turkey","Antalya :)))");
        System.out.println(       myHash.get("Turkey"));


        HashMap<String,String> mySkill=new HashMap<String ,String>();
        mySkill.put("Java","medium");
        mySkill.put("Sql","entry");
        mySkill.put("Selenium","master");
        mySkill.put("Cucumber","expert");
        System.out.println(mySkill);

        for (String key:mySkill.keySet()){
            System.out.println("key:"+key+"Value:"+mySkill.get(key));
        }
    }
}
