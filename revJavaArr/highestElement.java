public class highestElement {
    public static void main(String[] args) {
        int maxElement=Integer.MIN_VALUE;
        int arr[]={20,10,20,4,100};
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxElement){
                maxElement=arr[i];
            }
        }
        System.out.println(" The Maximum Element is : "+maxElement);
    }
}
