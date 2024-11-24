package JavaFunctions;

import java.util.Scanner;

public class javaProduct {
    public static int numsProduct(int a ,int b){
        int product =a*b;
        return product;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int resultOfProduct=numsProduct(a, b);
    System.out.println("the product of value is : " +resultOfProduct);
    }
}
