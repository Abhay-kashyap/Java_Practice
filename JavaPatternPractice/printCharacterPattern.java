package JavaPatternPractice;

public class printCharacterPattern {
    public static void main(String[] args) {
        // print character pattern 
        int n=4;
        char ch='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
