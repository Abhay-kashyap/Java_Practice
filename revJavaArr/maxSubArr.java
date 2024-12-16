public class maxSubArr {
    public static void main(String[] args) {
        int currSum;
        int maxSum=Integer.MIN_VALUE;
        int numbers[]={1,-2,6,-1,3};
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                currSum=0;
                for(int k=i;k<=j;k++){
                    currSum +=numbers[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("max sum " +maxSum);
    }
}
