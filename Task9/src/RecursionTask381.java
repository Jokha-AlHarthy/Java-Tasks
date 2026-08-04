public class RecursionTask381 {
    public static boolean isPowerOfTwo (int num){
        //Base call
        if(num == 1){
            return true;
        }

        //Recursion call
        if(num <= 0 || num % 2 != 0){
            return false;
        }
        return isPowerOfTwo(num / 2);
    }

    //calling the function inside the main
    public static void main(String[] args){
        System.out.println("isPowerOfTwo(1)→ " +isPowerOfTwo(1));
        System.out.println("isPowerOfTwo(8)→ "+isPowerOfTwo(8));
        System.out.println("isPowerOfTwo(16)→ "+isPowerOfTwo(16));
        System.out.println("isPowerOfTwo(6)→ "+isPowerOfTwo(6));
        System.out.println("isPowerOfTwo(20)→ "+isPowerOfTwo(20));
    }
}
