package JavaPatternPractice;

public class diamondPattern {
    public static void diamondPat(int n){
        // this approach 1-: third count variable
        // int count =0;
        // outer loops
    //    for(int i=1;i<=n;i++){
    //        for(int spaces=1;spaces<=n-i;spaces++){
    //            System.out.print(" ");
    //        }
    //        for(int j=1;j<=count+i;j++){
    //            System.out.print("*");
    //        }
    //        count++;
    //        System.out.println();
    //    }
    //   2nd half
    // int count2=n;
    //    for(int i=n;i>=1;i--){
    //        for(int spaces=1;spaces<=n-i;spaces++){
    //            System.out.print(" ");
    //        }
    //        for(int j=1;j<=count2+(i-1);j++){
    //            System.out.print("*");
    //        }
    //       count2= count2-1;
    //        System.out.println();
    //    }



    // this approach 2
    for(int i=1;i<=n;i++){
        // spaces
        for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        // for stars
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=n;i>=1;i--){
        for(int j=1;j<=n-i;j++){
            System.out.print( " ");
        }
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
    public static void main(String[] args) {
        diamondPat(4);
    }
}
