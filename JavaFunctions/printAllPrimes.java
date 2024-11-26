package JavaFunctions;

public class printAllPrimes {
    // wap to print all prime number in range

    // this function will be check number is prime or not 
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

    // this function will be print that number those are primes
    public static void printAllPrime(int n){
       for(int i=2;i<=n;i++){
      
        if(  isPrime(i)){
            System.out.print(i + " ");
        }
    }
    System.out.println();
    }
    public static void main(String[] args) {
        printAllPrime(20);
    }
}
