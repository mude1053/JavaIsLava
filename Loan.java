public class Loan {
  protected double interestRate;
    protected int numberOfPayment;
    protected double amount;
    Loan(double interestRate,int numberOfPayment,double amount){
        this.amount=amount;
        this.interestRate=interestRate;
        this.numberOfPayment=numberOfPayment;

    }
   private double mounthlyPayment(){
      return this.amount*this.interestRate/this.numberOfPayment;
    }
    double totalPayment(){
        return this.amount+this.amount*this.interestRate;
    }


}
