public class arrAvg {
    public static void main(String[] args) {
        int arr[]={3,4,5,7,9};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        double reuslt=sum/arr.length;
        System.out.println(reuslt);
    }
}
