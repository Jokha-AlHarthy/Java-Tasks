public class RecursionTask384 {
    public static int countChar (String str, char c){
        //Base call
        if(str.isEmpty()){
            return 0;
        }

        //Recursion call
        int match;
        if(str.charAt(0)==c) {
            match = 1;
        }else {
            match = 0;
        }

        return match + countChar(str.substring(1), c);
    }

    //calling the function inside the main
    public static void main(String[] args){
        System.out.println("countChar(\"banana\", 'a')→ " +countChar("banana", 'a'));
        System.out.println("countChar(\"hello\", 'l')→ "+countChar("hello", 'l'));
        System.out.println("countChar(\"apple\", 'z')→ "+countChar("apple", 'z'));
        System.out.println("countChar(\"mississippi\", 's')→ "+countChar("mississippi", 's'));
    }
}

