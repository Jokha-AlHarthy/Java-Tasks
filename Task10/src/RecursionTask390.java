public class RecursionTask390 {
    public static int countDigit (int num1, int num2){
        //Base call
        if(num1==0){
            return 0;
        }

        //Recursion call
        int isEqual;
        if(num1 % 10 == num2){
            isEqual = 1;
        }else{
            isEqual=0;
        }
        return isEqual + countDigit(num1/10, num2);
    }

    //calling the function inside main
    public static void main(String[] args){
        System.out.println("countDigit(2222, 2)→ "+ countDigit(2222, 2));
        System.out.println("countDigit(12321, 1)→ "+countDigit(12321, 1));
        System.out.println("countDigit(5050, 0)→ "+countDigit(5050, 0));
        System.out.println("countDigit(789, 6)→ "+countDigit(789, 6));

    }
}
