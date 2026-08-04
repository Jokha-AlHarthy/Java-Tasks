public class RecursionTask376 {
    public static void printUp (int n){
        //Base call
        if(n <= 0){
            return;
        }

        //recursion call
        printUp(n-1);
        System.out.println(n);
    }

    //calling the function inside the main
    public static void main(String[] args){
        System.out.println("printUp(3)");
        printUp(3);

        System.out.println("printUp(5)");
        printUp(5);
    }
}
