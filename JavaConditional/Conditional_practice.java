package JavaConditional;

import java.util.Scanner;

public class Conditional_practice {
    public static void main(String[] args) {
        // int age =15;
        // if(age>=18){
        //     System.out.println("your are elgible to vote");
        // }
        // if(age>13 && age<18){
        //     System.out.println("teenager");
        // }
        // else{
        //     System.out.println("you are not adult");
        // }
        // int a=5,b=3;
        // if(a>=b){
        //     System.out.println("A is largest of 2");
        // }else{
        //     System.out.println("B is the largest of 2");
        // }
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter a number");
        // int num=sc.nextInt();
        // if(num%2==0){
        //     System.out.println("number is even");
        // }else{
        //     System.out.println("number is odd");
        // }
        // int age=16;
        // if(age>=18){
        //     System.out.println("adult");
        // }else if(age>=13 && age<18){
        //     System.out.println("teenager");
        // }else{
        //     System.out.println("child");
        // }
        // Scanner sc=new Scanner(System.in);
        // int income=sc.nextInt();
        // int tax;
        // if(income<500000){
        //     tax=0;
        //     // System.out.println();
        // }else if(income>=500000 && income<1000000){
        //     tax=(int) (income*0.2);
        //     // System.out.println(tax);
        // }else{
        //     tax=(int)(income*0.3);
        // }
        // System.out.println("your tax is" +tax);
        // int a=1,b=3,c=6;
        // if(a>=b &&a>=c){
        //     System.out.println("a is greater than 3");
        // }else if(b>=c){
        //     System.out.println("b is greater then 3");
        // }else{
        //     System.out.println("c is greater then 3");
        // }
        // int number=5;
        // String type=(number%2==0)?"even":"odd";
        // System.out.println(type);
        // int marks =65;
        // String Status=marks>=33?"pass":"fail";
        // System.out.println(Status);
        // int number=2;
        // char ch='a';
        // switch(ch){
        //     case 'a':
        //     System.out.println("samosa");
        //     break;
        //     case 'b':
        //     System.out.println("burger");
        //     break;
        //     case 'c':
        //     System.out.println("mango shake");
        //     default:
        //     System.out.println("we wake up");
        // }
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number a");
        int a=sc.nextInt();
        System.out.println("enter a number b");
        int b=sc.nextInt();
        System.out.println("enter a operator");
        char operator=sc.next().charAt(0);
        switch (operator) {
            case '+':
            System.out.println(a+b);
                break;
            case '-':
            System.out.println(a-b);
            break;
            case '*':
            System.out.println(a*b);
            break;
            case '/':
            System.out.println(a/b);
            break;
            case '%':
            System.out.println(a%b);
            break;
            default:
            System.out.println("invalid input");
                break;
        }
    }
}
