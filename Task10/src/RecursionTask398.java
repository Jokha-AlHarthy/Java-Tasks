public class RecursionTask398 {
    public static int countUpper (String str){
        //Base call
        if(str.isEmpty()){
            return 0;
        }

        int count;
        if(Character.isUpperCase(str.charAt(0))){
            count = 1;
        }else{
            count = 0;
        }

        //Recursion call
        return count + countUpper(str.substring(1));
    }

    //calling the function inside the main
    public static void main(String[] args){
        System.out.println("countUpper(\"Hello\")→ " +countUpper("Hello"));
        System.out.println("countUpper(\"JavaProgram\")→ "+countUpper("JavaProgram"));
        System.out.println("countUpper(\"ABC\")→ "+countUpper("ABC"));
        System.out.println("countUpper(\"lower\")→ "+countUpper("lower"));
    }
}
