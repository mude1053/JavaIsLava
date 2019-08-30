public class BankAccount {
    private int accountNumber;
    private String accountName;
    private double  balance;

    public  BankAccount(int accountNumber,String accountName,double balance){
        this.accountName=accountName;
        this.accountNumber=accountNumber;
        this.balance=balance;

    }

    protected void addMoney(int amount){
        this.balance += amount;
    }

    protected void drawMoney(int amount){
        this.balance -= amount;
    }

    protected void changeName(String newName){
        this.accountName=newName;
    }
    double changeCurrentBalance(){
        if(this.balance<100){
            System.out.println("Your balance is low");
        }
        else{
            System.out.println("You're best customer we love you.");
        }
        return this.balance;
    }


    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", accountName='" + accountName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
