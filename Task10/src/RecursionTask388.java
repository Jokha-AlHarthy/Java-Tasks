public class RecursionTask388 {
    public static void printReverse (String str){
        //Base call
        if(str.isEmpty()){
            return;
        }

        //Recursion call
        printReverse(str.substring(1));

        System.out.println(str.charAt(0));
    }

    //calling the function inside the main
    public static void main(String[] args){
        System.out.println("printReverse(\"cat\")→");
        printReverse("cat");
        System.out.println("printReverse(\"hello\")→");
        printReverse("hello");
    }
}
