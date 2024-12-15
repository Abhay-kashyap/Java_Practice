public class reverseArray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int n=5;
        int rev[]=new int[n];
        for(int i=0;i<n;i++){
            rev[n-i-1]=arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(rev[i] + " ");
        }
    }
}
