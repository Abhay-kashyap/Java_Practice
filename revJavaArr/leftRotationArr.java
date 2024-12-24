public class leftRotationArr {
    public static void ArrayLeftRotation(int arr[],int r,int n){
        for(int i=0;i<r;i++){
            rotateLeft(arr, n);
        }
    }
    public static void rotateLeft(int arr[],int n){
        int i,temp;
        temp=arr[0];
        for(i=0;i<n-1;i++)
            arr[i]=arr[i+1];
            arr[i]=temp;
        
       }
    public static void main(String[] args) {
        int arr[]={11,22,33,44,55,66,77};
        int r=1;
        int n=arr.length;
        System.out.println("Array before Rotation");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        ArrayLeftRotation(arr,r,n);
        System.out.println("Array after left rotation");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
