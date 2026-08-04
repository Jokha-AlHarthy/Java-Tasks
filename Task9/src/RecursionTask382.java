public class RecursionTask382 {
    public static boolean isEven (int num){
        //Base call
        if(num== 0){
            return true;
        }

        if(num==1){
            return false;
        }

        //Recursion call
        return isEven(num - 2);
    }

    //calling the function inside the main
    public static void main(String[] args){
        System.out.println("isEven(0)→ " +isEven(0));
        System.out.println("isEven(8)→ "+isEven(8));
        System.out.println("isEven(7)→ "+isEven(7));
        System.out.println("isEven(15)→ "+isEven(15));
        System.out.println("isEven(100)→ "+isEven(100));
    }
}
