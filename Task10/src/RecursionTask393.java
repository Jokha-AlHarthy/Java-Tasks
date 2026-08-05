public class RecursionTask393 {
    public static int power(int b, int n){
        //Base call
        if(n==0){
            return 1;
        }

        //Recursion call
        if(n%2==0){
            return power(b, n/2) * power(b, n/2);
        }else{
            return b * power(b, n/2) *  power(b, n/2);
        }
    }

    //calling the function inside main
    public static void main(String[] args){
        System.out.println("power(2, 10)→ "+ power(2, 10));
        System.out.println("power(3, 4)→ "+power(3, 4));
        System.out.println("power(5, 3)→ "+power(5, 3));
        System.out.println("power(2, 0)→ "+power(2, 0));

    }
}
