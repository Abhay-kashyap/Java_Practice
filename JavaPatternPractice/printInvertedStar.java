package JavaPatternPractice;

public class printInvertedStar {
    public static void main(String[] args) {
        // print inverted star pattern
        // for(int line=1;line<=4;line++){
        //     for(int star=4;star>=line;star--){
        //         System.out.print('*');
        //     }
        //     System.out.println();
        // }

        // Approach 2:
        int n=4;
        for(int line=1;line<=n;line++){
            for(int star=1;star<=(n-line+1);star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}