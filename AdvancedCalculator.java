public class AdvancedCalculator extends Calculator{
   public String screenColor;
    AdvancedCalculator(){
        super();
        this.screenColor="Blue";

    }
 public double calcAverage(int a,int b){
        return (a+b)/2;
 }
 public int calcFactorial (int number){
        int result=1;
        for(int i=number;i>0;i--){
            result=result*i;
        }
        return result;
 }
 public double squareRoot(double number){
        return Math.sqrt(number);
 }
 public double power(int number,int pow){
        return Math.pow(number,pow);
 }

    @Override
    public String toString() {
        return "AdvancedCalculator{" +
                "screenColor='" + screenColor + '\'' +
                ", displayValue=" + displayValue +
                '}';
    }
}
