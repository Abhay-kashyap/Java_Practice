package JavaFunctionQuestions;

import java.util.Scanner;

public class averageOfThree {
// write a java method to compute the average of three numbers
public static int averageThreeNum(int a,int b,int c){
    int average=(a+b+c);
    return average;
}
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
   int result= averageThreeNum(a, b, c);
   System.out.println(" The average of three numbers is"  +result);
}    
}
