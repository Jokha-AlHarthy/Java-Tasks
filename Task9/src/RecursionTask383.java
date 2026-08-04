public class RecursionTask383 {
    public static boolean isPalindrome (String str){
        //Base call
        if(str.length() <= 1){
            return true;
        }

        //Compare the first and last characters
        if(str.charAt(0) != str.charAt(str.length()-1)){
            return false;
        }

        //Recursion call
        return  isPalindrome(str.substring(1, str.length()-1));
    }

    //calling the function inside the main
    public static void main(String[] args){
        System.out.println("isPalindrome(\"level\")→ " +isPalindrome("level"));
        System.out.println("isPalindrome(\"madam\")→ "+isPalindrome("madam"));
        System.out.println("isPalindrome(\"hello\")→ "+isPalindrome("hello"));
        System.out.println("isPalindrome(\"a\")→ "+isPalindrome("a"));
    }
}
