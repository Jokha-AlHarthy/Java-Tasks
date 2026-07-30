import java.util.Scanner;

public class PasswordStrengthChecker {
    //Create the main method inside the class
    public static void main(String[] args) {
        //Prompt the user to enter a password using a Scanner
        Scanner input = new Scanner(System.in);

        //Create a String variable to store the password entered by the user
        String password = input.next();

        //Checking If the password length is less than or equal to 0
        if (password.length() <= 0) {
            System.out.println("Invalid password");
        } else {
            //Analyze the password using String methods
            int choice;
            do {
                System.out.println("1. Enter Password");
                System.out.println("2. Check Password Length");
                System.out.println("3. Analyze Password Characters");
                System.out.println("4. Check Password Strength");
                System.out.println("5. Convert Password Format");
                System.out.println("6. Display Password Report");
                System.out.println("7. Exit");

                System.out.println("Please choose number from the list");
                choice = input.nextInt();

                switch (choice) {
                    case 1://Enter Password
                        System.out.println("Please enter the new password: ");
                        password = input.next();
                        if (password.length() <= 0) {
                            System.out.println("Invalid password");
                        } else {
                            System.out.println("Password saved successfully");
                        }
                        break;
                    case 2: //Check Password Length
                        System.out.println("The total number of characters in the password" + password.length());
                        if (password.length() < 8) {
                            System.out.println("Password is too short");
                        } else {
                            System.out.println("Password length is acceptable");
                        }
                        break;
                    case 3://Analyze Password Characters
                        int totalUppercase = 0;
                        int totalLowercase = 0;
                        int totalDigits = 0;
                        int totalSpecialChar = 0;
                        for (int i = 0; i < password.length(); i++) {
                            char ch = password.charAt(i);
                            if (Character.isUpperCase(ch)) {
                                totalUppercase++;
                            } else if (Character.isLowerCase(ch)) {
                                totalLowercase++;
                            } else if (Character.isDigit(ch)) {
                                totalDigits++;
                            } else {
                                totalSpecialChar++;
                            }
                        }
                        System.out.println("Total uppercase letters" + totalUppercase);
                        System.out.println("Total lowercase letters" + totalLowercase);
                        System.out.println("Total digits: " + totalDigits);
                        System.out.println("Total special characters: " + totalSpecialChar);
                        break;
                    case 4: //Check Password Strength
                        boolean hasUpperCase = false;
                        boolean hasLowerCase = false;
                        boolean hasDigitChar = false;
                        boolean hasSpecialChar = false;
                        for (int i = 0; i < password.length(); i++) {
                            char ch = password.charAt(i);
                            if (Character.isUpperCase(ch)) {
                                hasUpperCase = true;
                            } else if (Character.isLowerCase(ch)) {
                                hasLowerCase = true;
                            } else if (Character.isDigit(ch)) {
                                hasDigitChar = true;
                            } else {
                                hasSpecialChar = true;
                            }
                        }

                        //Display Password Strength
                        String Strength;
                        if (password.length() >= 8 && hasUpperCase && hasLowerCase && hasDigitChar && hasSpecialChar) {
                            System.out.println("Strong Password");
                        } else if (password.length() >= 6 && (hasUpperCase || hasLowerCase || hasDigitChar || hasSpecialChar)) {
                            System.out.println("Medium Password");
                        } else {
                            System.out.println("Weak Password");
                        }
                        break;
                    case 5: //Convert Password Format
                        System.out.println("Password in uppercase: " + password.toUpperCase());
                        System.out.println("Password in lowercase: " + password.toLowerCase());
                        break;
                    case 6://Display Password Report
                        int Upper = 0;
                        int Lower = 0;
                        int digit = 0;
                        int spec = 0;

                        for (int i = 0; i < password.length(); i++) {
                            char ch = password.charAt(i);
                            if (Character.isUpperCase(ch)) {
                                Upper++;
                            } else if (Character.isLowerCase(ch)) {
                                Lower++;
                            } else if (Character.isDigit(ch)) {
                                digit++;
                            } else {
                                spec++;
                            }
                        }

                        System.out.println("Password length: " + password.length());
                        System.out.println("First character: " + password.charAt(0));
                        System.out.println("Last character: " + password.charAt(password.length() - 1));
                        System.out.println("Number of uppercase letters: " + Upper);
                        System.out.println("Number of lowercase letters:  " + Lower);
                        System.out.println("Number of digits: " + digit);
                        System.out.println("Number of special characters" + spec);
                        break;
                    case 7: //Exit
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Invalid Number");
                }
            } while (choice != 7);
        }
        input.close();
    }
}
