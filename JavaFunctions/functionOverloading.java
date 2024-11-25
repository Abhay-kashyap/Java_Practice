package JavaFunctions;

public class functionOverloading {
    // function overloading depends on the two values are -:
    /*
    * 1) no of parameters
     *2) type of parameters
     */
    //Case 1 : no of Parameters
    // function to calculate sum of 2 numbers
    // public static int sum(int a,int b){
    //     return a+b;
    // }
    // public static int sum(int a ,int b,int c){
    //     return a+b+c;
    // }
    // case 2: Type of Parameters
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum (float a,float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(3,5));
        System.out.println(sum(3.2f,4.8f));
    }
}
