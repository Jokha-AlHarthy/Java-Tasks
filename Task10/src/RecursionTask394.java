public class RecursionTask394 {
    public static int countZeros (int num){
        //Base call
        if(num<10){
            if(num ==0){
                return 1;
            }else{
                return 0;
            }
        }

        //Recursion call
        int isZero;
        if(num % 10 == 0){
            isZero = 1;
        }else{
            isZero=0;
        }
        return isZero + countZeros(num/10);
    }

    //calling the function inside main
    public static void main(String[] args){
        System.out.println("countZeros(1020)→ "+ countZeros(1020));
        System.out.println("countZeros(5000)→ "+countZeros(5000));
        System.out.println("countZeros(123)→ "+countZeros(123));
        System.out.println("countZeros(908070)→ "+countZeros(908070));

    }
}
