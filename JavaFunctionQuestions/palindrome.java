package JavaFunctionQuestions;

public class palindrome {
    public static boolean isPlaindrome(int n){
        int r,rev=0,temp;
        temp=n;
        while(n>0){
             r=n%10;
            rev=rev*10+r;
            // n=n/10;
        }
        System.out.println(rev);
        
        if(temp==rev){
            return true;
        }else{
            return false;
        }

       
       
    }
    public static void main(String[] args) {
        System.out.println(isPlaindrome(1551));

    }
}
