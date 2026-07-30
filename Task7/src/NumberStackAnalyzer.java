import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class NumberStackAnalyzer {
    //Create the main method inside the class
    public static void main(String[] args){
        //Create a Stack<Integer> to store integer values
        Deque<Integer>integerValues = new ArrayDeque<>();

        //Ask user to enter the number of values using a Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter how many numbers you want for integer numbers");
        int numOfValues = input.nextInt();

        //Checking If the entered number is less than or equal to 0
        if(numOfValues<=0){
            System.out.println("Invalid number of values");
        }else{
            //Use a for loop to read each integer
            for(int i=0; i<numOfValues; i++){
                System.out.println("Enter an integer number: ");
                int intNumber = input.nextInt();
                integerValues.push(intNumber);
            }

            //Display the following menu using a do-while loop
            int choice;
            do{
                System.out.println("1. Add Number");
                System.out.println("2. Remove Top Number");
                System.out.println("3. View Top Number");
                System.out.println("4. Display All Numbers");
                System.out.println("5. Analyze Numbers");
                System.out.println("6. Exit");

                System.out.println("Please enter number from the list");
                choice = input.nextInt();

                switch (choice){
                    case 1: //Add Number
                        System.out.println("PLease enter new integer number");
                        int newNumber = input.nextInt();
                        integerValues.push(newNumber);
                        System.out.println("Number added successfully");
                        break;
                    case 2: //Remove Top Number
                        if(integerValues.isEmpty()){
                            System.out.println("Stack is empty");
                        }else{
                            System.out.println("Removing number from the top: "+integerValues.pop());
                        }
                        break;
                    case 3: //View Top Number
                        if(integerValues.isEmpty()){
                            System.out.println("Stack is empty");
                        }else{
                            System.out.println("The top number in the stack is: "+integerValues.peek());
                        }
                        break;
                    case 4: //Display All Numbers
                        if(integerValues.isEmpty()){
                            System.out.println("Stack is empty");
                        }else {
                            int totalElements = integerValues.size();
                            int sum = 0;
                            int largest = Integer.MAX_VALUE;
                            int lowest = Integer.MIN_VALUE;
                            int evenNum = 0;
                            int oddNum = 0;
                            int posNum = 0;
                            int negNum = 0;
                            int zeroNum = 0;

                            for(int num: integerValues){
                                //Sum of all numbers
                                sum+= num;

                                //Largest number
                                if(num>largest){
                                    largest = num;
                                }

                                //Smallest number
                                if(num<lowest){
                                    lowest = num;
                                }

                                //Count how many even & odd
                                if(num % 2==0){
                                    evenNum++;
                                }else{
                                    oddNum++;
                                }

                                //Count how many positive, negative & zero
                                if(num > 0){
                                    posNum++;
                                } else if (num<0) {
                                    negNum++;
                                }else{
                                    zeroNum++;
                                }
                            }
                            //Average of all numbers
                            double average = (double) sum / totalElements;

                            //Display results
                            System.out.println("Total number of elements: "+totalElements);
                            System.out.println("Sum of all numbers: "+sum);
                            System.out.println("Average of all numbers: "+average);
                            System.out.println("Largest number: "+largest);
                            System.out.println("Smallest number: "+lowest);
                            System.out.println("Total even numbers: "+evenNum);
                            System.out.println("Total odd numbers: "+oddNum);
                            System.out.println("Total positive numbers: "+posNum);
                            System.out.println("Total negative numbers: "+negNum);
                            System.out.println("Total zeros: "+zeroNum);
                        }
                }
            }while(choice!=6);
        }
        input.close();
    }
}
