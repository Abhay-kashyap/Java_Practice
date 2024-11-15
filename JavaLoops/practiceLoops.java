package JavaLoops;

import java.util.Scanner;

public class practiceLoops {
 public static void main(String[] args) {
    // int count =0;
    // while(count<10){
    //     System.out.println("hello world");
    //     count++;
    // }
    // System.out.println("printed HW " +count);

    // print number from 1 to 10
    // int count=1;
    // while(count<=10){
    //     System.out.print(count);
    //     count++;
    // }
    // System.out.println();


    // print number from 1 to n
    Scanner sc = new Scanner(System.in);
    // int range=sc.nextInt();
    // int count=1;
    // while(count<=range){
    //     System.out.print(count +" ");
    //     count++;
    // }
    // System.out.println();
    // print sum of first n natural numbers
    int range =sc.nextInt();
    int sum=0;
    int num=1;
    while(num<=range){
        sum+=num;
        num++;
    }
    System.out.println(sum);
   
 }   
}
