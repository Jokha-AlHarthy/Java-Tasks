public class RecursionTask389 {
    public static int sumEven (int num){
        //Base call
        if(num==0){
            return 0;
        }

        //Recursion call
        if(num%2==0){
            return num + sumEven(num - 1);
        }else{
            return sumEven(num-1);
        }
    }

    //calling the function inside main
    public static void main(String[] args){
        System.out.println("sumEven(2)→ "+ sumEven(2));
        System.out.println("sumEven(6)→ "+sumEven(6));
        System.out.println("sumEven(10)→ "+sumEven(10));
        System.out.println("sumEven(1)→ "+sumEven(1));

    }
}
