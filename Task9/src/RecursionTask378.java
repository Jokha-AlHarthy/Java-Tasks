public class RecursionTask378 {
    public static int multiply (int a, int b){
        //Base call
        if(b==0){
            return 0;
        }

        //Recursion call
        return a + multiply(a, b-1);

    }

    //calling the function inside the main
    public static void main(String[] args){
        System.out.println("multiply(3, 4)→ "+multiply(3, 4));
        System.out.println("multiply(5, 2)→ "+multiply(5, 2));
        System.out.println("multiply(0, 9)→ "+multiply(0, 9));
        System.out.println("multiply(6, 1)→ "+multiply(6, 1));
    }
}

