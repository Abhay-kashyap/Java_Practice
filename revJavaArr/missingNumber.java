public class missingNumber {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,};
        // representing the range of the integers
        int n=8;
        int totalSum=n*(n+1)/2;
        int arraySum=0;
        for(int num:arr){
            arraySum+=num;
        }
        int missingNumberVal=totalSum-arraySum;
        System.out.println("Missing Number is : " +missingNumberVal );
    }
}
