public class findSmallestElement {
public static int getLargest(int numbers[] ) {
    int Largest=Integer.MIN_VALUE;
    int Smallest=Integer.MAX_VALUE;
    for(int i=0;i<numbers.length;i++){
        if(Largest<numbers[i]){
            Largest=numbers[i];
        }
        if(Smallest>numbers[i]){
            Smallest=numbers[i];
        }
        
    }
    System.out.println("Smallest Value is " + Smallest);
    return Largest;
}
    public static void main(String[] args) {
        int numbers[]={12,34,50,7,26};
        System.out.println("Largest Values is : " + getLargest(numbers));
    }
}
