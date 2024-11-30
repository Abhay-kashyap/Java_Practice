package JavaPatternPractice;

import java.util.Scanner;

public class InvertedHalfWithNum {
    public static void InvertedHalfWithNums(int n){
        // outer loops 
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        InvertedHalfWithNums(n);
    }
}
