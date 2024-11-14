package JavaVariableAndDataTypes;
import java.util.*;
public class question2 {
    public static void main(String[] args) {
        System.out.println("ENter the side of a square");
        Scanner sc=new Scanner(System.in);
        float side=sc.nextFloat();
        float area= (side*side);
        System.out.println("area of a square is  "+area);
    }
}
