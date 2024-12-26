public class maxSub {
    public static int maxSubArr(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<arr.length;i++){
            
            for(int j=i;j<arr.length;j++){
                currSum=0;
                for(int k=i;k<=j;k++){
                    currSum+=arr[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        // System.out.println(maxSum);
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[]={3,-4,5,4,-1,7,-8};
        int result=maxSubArr(arr);
        System.out.println(result);
    }
}
