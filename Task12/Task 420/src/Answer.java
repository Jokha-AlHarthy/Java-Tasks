import java.util.Scanner;

public class Answer {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       //Read a word from the user into String answer
       IO.println("Enter a word: ");
       String answer = sc.nextLine();

       //Check if (answer == "yes") and print "used ==". Run it and type yes
       if(answer =="yes"){
           IO.println("Yes");
       }

       //Now change it to if (answer.equals("yes")) and run again
       if(answer.equals("yes")){
           IO.println("Yes and");
       }

       /*
       * The first == didn't worked but the .equals worked because the first method doesn't check the actual text
       */
   }
}