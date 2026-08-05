public class RecursionTask395 {
    public static boolean contains (String str, char c){
        //Base call
        if(str.isEmpty()){
            return false;
        }

        //Recursion call
        boolean match;
        if(str.charAt(0)==c) {
            return true;
        }

        return contains(str.substring(1), c);
    }

    //calling the function inside the main
    public static void main(String[] args){
        System.out.println("contains(\"hello\", 'e')→ " +contains("hello", 'e'));
        System.out.println("contains(\"world\", 'z')→ "+contains("world", 'z'));
        System.out.println("contains(\"java\", 'a')→ "+contains("java", 'a'));
        System.out.println("contains(\"\", 'x')→ "+contains("", 'x'));
    }
}
