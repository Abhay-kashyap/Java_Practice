package revJavaArr;
import java.util.*;
public class arr {
    // revision of array
    public static void main(String[] args) {
        int n=5;
        int arr[]=new  int[n];
        // taking user input arr
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the element of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        // Display the element of array
        System.out.println("Array Displayed");
        for(int i=0;i<n;i++){
            System.out.print( arr[i] + " ");
        }
    }
}
