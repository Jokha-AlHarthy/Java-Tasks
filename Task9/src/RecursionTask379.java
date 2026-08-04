public class RecursionTask379 {
    public static int length (String str){
        //Base call
        if(str.isEmpty()){
            return 0;
        }

        //Recursion call
        return 1 + length(str.substring(1));

    }

    //calling the function inside the main
    public static void main(String[] args){
        System.out.println("length(\"cat\")→ " +length("cat"));
        System.out.println("length(\"hello\")→ "+length("hello"));
        System.out.println("length(\"\")→ "+length(""));
        System.out.println("length(\"a\")→ "+length("a"));
    }
}
