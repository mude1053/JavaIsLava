public class HomeLoand extends Loan{
    protected int PMI;
    HomeLoand(double interestRate,int numberOfPayment,double amount,int PMI){
        super( interestRate, numberOfPayment,amount);
        this.PMI=PMI;
    }
    double monthlyPayment(){
        return super.amount*super.interestRate/super.numberOfPayment+this.PMI;
    }
    double totalPayment(){
        return super.amount*super.interestRate+this.PMI*super.numberOfPayment;
    }
    static int counter=0;
    static void p () {
        if(counter<5) {
            System.out.println("Hello");
            counter++;
        p();}
    }
}
