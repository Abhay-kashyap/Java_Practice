package JavaLoops;

import java.util.Scanner;

public class practiceDoWhileLoop {
   public static void main(String[] args) {
    // int counter=1;
    // do{
    //     System.out.println("hello world");
    //     counter++;
    // }while(counter<10);
    
    // break statements
    // for(int i=1;i<=5;i++){
    //     if(i==3){
    //         break;
    //     }
    //     System.out.println(i);
    // }
    // System.out.println("i am out of the loop");
    // Scanner sc=new Scanner(System.in);
    // System.out.println("enter a number");
    // do{
    //     int n=sc.nextInt();
    //     if(n%10==0){
    //         break;
    //     }
    //     System.out.println(n);
    // }while(true);
    // for(int i=1;i<=5;i++){
    //     if(i==3){
    //         continue;
    //     }
    //     System.out.println(i);
    // }
    Scanner sc=new Scanner(System.in);
    while(true){
        System.out.println("enter a number");
        int n=sc.nextInt();
        if(n%10==0){
            continue;
        }
        System.out.println("number was " +n);
    }


   } 
}
