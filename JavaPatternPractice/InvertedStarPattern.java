package JavaPatternPractice;

import java.util.Scanner;

public class InvertedStarPattern {
    public static void main(String[] args) {
        // print a inverted star pattern like this 
        /*
                   *
                  **
                 ***
                ****  
         */
        // this loop for works as print no of rows how many rows printed
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the rows no ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            // this loops works as print spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // System.out.println();
            // this loop  print a star 
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
