public class CarLoan extends Loan {
    double APR;
    int creditScore;
    CarLoan(double interestRate,int numberOfPayment,double amount,double APR, int creditScore){
        super( interestRate, numberOfPayment, amount);
        this.APR=APR;
        this.creditScore=creditScore;
    }
    double monthlyPayment(){
        return super.amount*this.APR/super.numberOfPayment-(this.creditScore/10);
    }
    double totalPayment(){
        return super.amount*super.interestRate;
    }
}
