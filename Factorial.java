public class Factorial {
    public static void main(String[] args) {
        System.out.println(Factorial.factorial(6));
        System.out.println(Factorial.power(9,3));
    }
    static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }
    static int power(int n,int a){
        if(a==0){
            return 1;
        }
        else{
            return n*power(n,a-1);
        }
    }
}
