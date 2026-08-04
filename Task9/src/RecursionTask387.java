public class RecursionTask387 {
    public static int countVowels(String str){
        //Base call
        if(str.isEmpty()){
            return 0;
        }

        char ch = Character.toLowerCase(str.charAt(0));
        int count;
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            count = 1;
        }else{
            count = 0;
        }
        //Recursion call
        return count + countVowels(str.substring(1));
    }

    //calling the function inside the main
    public static void main(String[] args){
        System.out.println("countVowels(\"hello\") → " +countVowels("hello") );
        System.out.println("countVowels(\"programming\"))→ "+countVowels("programming"));
        System.out.println("countVowels(\"sky\")→ "+countVowels("sky"));
        System.out.println("countVowels(\"aeiou\")→ "+countVowels("aeiou"));
    }
}
