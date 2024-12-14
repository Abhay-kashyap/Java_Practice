import java.util.Scanner;



public class binary {
    public static void binarySearch(int arr[],int target){
        int index=-1;
        int low=0;
        int high =arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                index=mid;
                break;
            }else if(arr[mid]<target){
                low=mid+1;
            }else if(arr[mid]>target){
                high =mid-1;
            }
        }
        if(index!=-1){
            System.out.println("element present");
            System.out.println(index);
        }
        else{
            System.out.println("element absent");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // taking size of array
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        // taking input of array
        System.out.println("enter the element of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter that element you want to search");
        int target=sc.nextInt();
       binarySearch(arr,target);
    }
}
