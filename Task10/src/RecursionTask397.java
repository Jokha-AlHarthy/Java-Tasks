public class RecursionTask397 {
    public static String toBinary (int num){
        //Base call
        if(num == 0 || num == 1){
            return String.valueOf(num);
        }

        //Recursion call
        return toBinary(num / 2) + (num % 2);
    }

    //calling the function inside the main
    public static void main(String[] args){
        System.out.println("toBinary(2)→ " +toBinary(2));
        System.out.println("toBinary(5)→ "+toBinary(5));
        System.out.println("toBinary(10)→ "+toBinary(10));
        System.out.println("toBinary(1)→ "+toBinary(1));
    }
}
