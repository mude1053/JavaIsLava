public class BankTest {
    public static void main(String[] args) {
        BankAccount myObj = new BankAccount(12, "Ospirik", 100);
        myObj.addMoney(120);
        myObj.drawMoney(2000);
        myObj.changeName("Muratik");
        myObj.changeCurrentBalance();
        System.out.println(myObj);
        CarLoan myCar = new CarLoan(2.4, 36, 25000, 1.5, 800);
        System.out.println(myCar.monthlyPayment());
        HomeLoand myHome = new HomeLoand(2.4, 200, 280000, 12);
        System.out.println(myHome.monthlyPayment());

myHome.p();

    }
}
