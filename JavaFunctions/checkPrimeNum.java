package JavaFunctions;

public class checkPrimeNum {
    // public static boolean numIsPrime(int n){
    //     // boolean isPrime=true;
    //     for(int i=2;i<=(n-1);i++){
    //         // corner cases
    //         if(n==2){
    //             return true;
    //         }
    //         // if(n%2==0){
    //         //     isPrime=true;
    //         // }
    //         if(n%i==0){
    //           return false;
    //         }
    //     }
    //     return true;
    // }


    //  write a optimize code for prime numbers
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
    System.out.println(isPrime(7));
    }
}