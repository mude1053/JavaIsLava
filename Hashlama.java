import java.util.HashMap;

public class Hashlama {
    public static void main(String[] args) {
hasmet();


    }
    public static void hasmet(){
        HashMap<String,Integer> cities=new HashMap<String ,Integer>();
        cities.put("Los Angeles",85);
        cities.put("Chicago",30);
        cities.put("Ankara",06);
        cities.put("Balikesir",10);
        int avarege=0;
        for (String key: cities.keySet()){
            System.out.println("key:"+key+"Value:"+cities.get(key));
            avarege=avarege+cities.get(key);
    }
        System.out.println("Average temp: "+avarege/cities.size());



    }

}
