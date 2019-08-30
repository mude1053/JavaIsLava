public class BicycleTest {
    public static void main(String[] args) {
        BicycleChild myBicycle =new BicycleChild(6,20,28,"high");
        myBicycle.speedUp(10);
        myBicycle.slowDown(5);
        myBicycle.changeTireSize(25);
        System.out.println(  myBicycle.toString());
        Bicycle myBike=new Bicycle(10,25);

    }
}
