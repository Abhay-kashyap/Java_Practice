package JavaVariableAndDataTypes;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float pencil=sc.nextFloat();
        float pen=sc.nextFloat();
        float eraser=sc.nextFloat();
        float total=pen+pencil+eraser;
        System.out.println("The total cost of the items " +total);
        float newBill=total+ (0.18f * total);
        System.out.println(newBill);
    }
}
