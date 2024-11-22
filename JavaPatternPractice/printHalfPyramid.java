package JavaPatternPractice;

public class printHalfPyramid {
    public static void main(String[] args) {
        int n=5;
        // print half pyramid pattern
        // outer loop 
        for(int line=1;line<=n;line++){
            for(int number=1;number<=line;number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
