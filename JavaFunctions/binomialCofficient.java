package JavaFunctions;

public class binomialCofficient {
    // this function calculate factorial 
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;

    }
    public static int binomialCalculate(int n,int r){
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int nmr_fact=factorial(n-r);
        int binomial=n_fact/(r_fact*nmr_fact);
        return binomial;
    }
    public static void main(String[] args) {
        // System.out.println(factorial(7));
        System.out.println(binomialCalculate(7, 5));
    }
}
