package JavaFunctions;

import java.util.Scanner;

public class javaFunctionSwapNumbers {
    public static void swapTwoNums(int a ,int  b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a value is " +a);
        System.out.println("b value is " +b);
       
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        swapTwoNums(a, b);
        // for important points java always pass call by value it means is pass copy value not original;
        
        System.out.println(a);

    }
}
