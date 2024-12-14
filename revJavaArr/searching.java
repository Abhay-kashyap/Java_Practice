import java.util.Scanner;

public class searching {
    public static void linear(int arr[],int target){
        // that variable is define checking element is exist or not
        // boolean found=false;
        // that element exits or not and return the position of elements
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                index=i;

                break;
            }
        }
        if(index!=-1){
            System.out.println("element present " + index);
        }
        else{
            System.out.println("element is absent");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n =sc.nextInt();
        int arr[]=new int [n];
        // taking input in array 
        System.out.println("enter the element of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter target element found in array");
        int target=sc.nextInt();
        linear(arr,target); 
    }
}
