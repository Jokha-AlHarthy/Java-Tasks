public class RecursionTask375 {
    public static void countDownUp (int n){
        //Base call
        if(n <= 0){
            return;
        }
        System.out.println(n);

        //Recursion call
        countDownUp(n - 1);
        if(n>1){
            System.out.println(n);
        }
    }

    //calling the function inside the main
    public static void main(String[] args){
        System.out.println("countDownUp(3)");
        countDownUp(3);

        System.out.println("countDownUp(1)");
        countDownUp(1);

        System.out.println("countDownUp(4)");
        countDownUp(4);
    }
}
