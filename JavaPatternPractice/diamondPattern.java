package JavaPatternPractice;

public class diamondPattern {
    public static void diamondPat(int n){
        int count =0;
        // outer loops
       for(int i=1;i<=n;i++){
           for(int spaces=1;spaces<=n-i;spaces++){
               System.out.print(" ");
           }
           for(int j=1;j<=count+i;j++){
               System.out.print("*");
           }
           count++;
           System.out.println();
       }
    //   2nd half
    int count2=n;
       for(int i=n;i>=1;i--){
           for(int spaces=1;spaces<=n-i;spaces++){
               System.out.print(" ");
           }
           for(int j=1;j<=count2+(i-1);j++){
               System.out.print("*");
           }
          count2= count2-1;
           System.out.println();
       }
    }
    public static void main(String[] args) {
        diamondPat(4);
    }
}
