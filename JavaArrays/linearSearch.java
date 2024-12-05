package JavaArrays;

public class linearSearch {
    // public static int linear(int number[],int key){
    //     for(int i=0;i<number.length;i++){
    //         if(number[i]==key){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    public static int linearStr(String menu[],String key){
        for(int i=0;i<menu.length;i++){
            if(menu[i]==key){
                return i;
            }
        }
    return -1;
    }
    public static void main(String[] args) {
        // int number[]={2,4,6,8,10,12,14,16};
        // int key =10;
        // int index=linear(number, key);
        // if(index==-1){
        //     System.out.println("not found");
        // }else{
            
        //     System.out.println("key is at index " +index);
        // }
        String menu[]={"Dosa" ,"Pasta" ,"Macrooni" ,"Veg noodles","Mix Vegetables","samosa","sandwhich"};
        String key="Macrooni";
        int index=linearStr(menu, key);
        if(index == -1){
            System.out.println("not found");
        }else{
            System.out.println("key at the index " +index);
        }
    }
    
}
