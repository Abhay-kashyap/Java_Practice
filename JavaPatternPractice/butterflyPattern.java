package JavaPatternPractice;

public class butterflyPattern {
    public static void butterflyPat(int n){
        // This loops represent as rows of stars
        for(int i=1;i<=n;i++){
            // stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            } 
            // print space
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            // print stars
            for(int l=1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();

        }
        // 2nd half parts 
        for(int i=n;i>=1;i--){
            // print stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            } 
            //  print space
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            // print stars
            for(int l=1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        butterflyPat(4);
    }
}
