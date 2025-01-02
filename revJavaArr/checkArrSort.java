public class checkArrSort {
    public static void main(String[] args) {
        int arr[]={2,1,3,4,5};
        boolean Sorted=true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                Sorted=false;
                break;
            }
        }
        System.out.println("is the array sorted " + Sorted);
    }
}
