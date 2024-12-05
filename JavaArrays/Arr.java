package JavaArrays;

public class Arr {
    // In this program we understand how to pass array as function
    public static void update(int marks[]){
        // nonChangeable=10;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={97,98,99};
        int nonChangeable=5; //here we checking call by value
        // update(marks ,nonChangeable);
        update(marks );
        // for(int i=0;i<marks.length;i++){
        //     System.out.print(marks[i] + " ");
        // }
        // System.out.println();
        // print our marks
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println(nonChangeable);
    }
}
