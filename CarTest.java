public class CarTest {
    public static void main(String[] args) {
        Suv mySuv=new Suv();
        mySuv.run();
        System.out.println(mySuv.wheels);
        System.out.println(mySuv.brand);
        mySuv.climb();

        Car myCar=new Car();
        System.out.println( myCar.brand);
    }
}
