package JavaFunctionQuestions;

public class sumOfDigit {
    public static int sumOfDigit(int n){
        int sum=0;
        while(n>0){
           int  lastdigit=n%10;
            sum+=lastdigit;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigit(876));
    }
}
