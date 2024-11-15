package JavaLoops;

public class printRevese {
    public static void main(String[] args) {
        // Print reverse the given number
        // long n=12878978;
        // while(n>0){
        //  long lastDigit=n%10;
        //  System.out.print(lastDigit);
        //  n=n/10;   
        // }
        // for(int n=2242;n>0;){
        //     int lastDigit=n%10;
        //     System.out.print(lastDigit);
        //     n/=10;
        // }


        // Reverse the given number
        int n=1091;
        int rev=0;
        while(n>0){
            int lastDigit=n%10;
            rev =(rev*10)+lastDigit;
            n/=10;
        }
        System.out.println(rev);
    }
}
