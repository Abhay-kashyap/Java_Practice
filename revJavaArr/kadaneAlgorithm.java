public class kadaneAlgorithm {
    public  static int maxSubArr(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currSum += arr[i];
            if(maxSum<currSum){
                maxSum=currSum;
            }
            if(currSum<0){
                currSum=0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[]={3,-4,5,4,-1,7,-8};
        int result=maxSubArr(arr);
        System.out.println(result);
    }
}