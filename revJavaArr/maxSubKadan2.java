public class maxSubKadan2 {
    public static void kadane(int numbers[]){
        int currSum=0;
        int ms=Integer.MIN_VALUE;
      
    
            for(int i=0;i<numbers.length;i++){
                // calculate currsum
                currSum=currSum+ numbers[i];
                if(currSum<0){
                    currSum=0;
                }
                ms=Math.max(currSum, ms);
            }
       
        System.out.println("our max sum is : " +ms);
    }
    public static void main(String[] args) {
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        kadane(numbers);
    }
}
