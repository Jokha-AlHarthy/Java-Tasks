public class RecursionTask392 {
    public static String removeChar (String str, char c){
        //Base call
        if(str.isEmpty()){
            return "";
        }

        //Recursion call
        if(str.charAt(0)==c) {
            return removeChar(str.substring(1), c);
        }else {
            return str.charAt(0)+removeChar(str.substring(1), c);
        }
    }

    //calling the function inside the main
    public static void main(String[] args){
        System.out.println("removeChar(\"banana\", 'a')→ " +removeChar("banana", 'a'));
        System.out.println("removeChar(\"hello\", 'l')→ "+removeChar("hello", 'l'));
        System.out.println("removeChar(\"mississippi\", 's')→ "+removeChar("mississippi", 's'));
        System.out.println("removeChar(\"abc\", 'z')→ "+removeChar("abc", 'z'));
    }
}
