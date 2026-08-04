public class RecursionTask377 {
    public static int countDigits (int n){
        //Base call
        if(n<10){
            return 1;
        }

        //Recursion call
        return 1 + countDigits(n/10);

    }

    //calling the function inside the main
    public static void main(String[] args){
        System.out.println("countDigits(7)→ "+ countDigits(7));
        System.out.println("countDigits(45)→ "+countDigits(45));
        System.out.println("countDigits(1000)→ "+countDigits(1000));
        System.out.println("countDigits(999999)→ "+countDigits(999999));
        
    }
}
