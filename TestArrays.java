public class TestArrays {
    public static void main(String[] args) {
        CrateArray myArr= new CrateArray();
        int[] param={1,3,5,7,8,9,5,4};
        System.out.println(myArr.array(param,5));

        StatArrays myStat = new StatArrays();
        System.out.println(myStat.average(param));
        System.out.println(myStat.returnMax(param));
        System.out.println("min"+ myStat.returnMin(param));
    }
}
