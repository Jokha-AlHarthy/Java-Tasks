public class RecursionTask380 {
    public static int sumDigits (int num){
        //Base call
        if(num == 0){
            return 0;
        }

        //Recursion call
        return (num%10) + sumDigits(num / 10);

    }

    //calling the function inside the main
    public static void main(String[] args){
        System.out.println("sumDigits(5)→ " +sumDigits(5));
        System.out.println("sumDigits(123)→ "+sumDigits(123));
        System.out.println("sumDigits(999)→ "+sumDigits(999));
        System.out.println("sumDigits(4021)→ "+sumDigits(4021));
    }
}
