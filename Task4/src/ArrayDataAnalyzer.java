import java.sql.SQLOutput;
import java.util.Arrays;

public class ArrayDataAnalyzer {
    public static void main(String[] args){
        //Create and Initialize Array
        int[]numbers = {45, 12, -5, 90, 33, 12, 0, 67, -20, 88, 45, 100, 7, -3, 55};

        //Display Array Information
        System.out.println("The total number of elements are: "+numbers.length);
        System.out.println("The first element is: "+numbers[0]);
        System.out.println("The last element is: "+numbers[numbers.length - 1]);
        for(int i=0; i < numbers.length; i++){
            System.out.println("Index "+i+" = "+numbers[i]);
        }

        //Calculate and display

        //1. Sum of all numbers
        int sum = 0;
        for(int num: numbers){
           sum+= num;
        }
        System.out.println("The sum of all numbers: "+sum);

        //2. Average value
        System.out.println("The average of all number is: "+sum/15);

        //3. Largest number
        int max = numbers[0];
        for (int maximum: numbers){
            if(maximum > max){
                max = maximum;
            }
        }
        System.out.println("The largest number in the array is: "+max);

        //4. Smallest number
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if(numbers[1] < min){
                min = numbers[i];
            }
        }
        System.out.println("The smallest number in the array is: "+min);

        //Analyze the array values and display
        int pos = 0;
        int neg = 0;
        int zero = 0;
        int even = 0;
        int odd = 0;
        for (int num: numbers){
            if(num > 0){
                //Count of positive numbers
                pos++;
            } else if (num < 0) {
                //Count of negative numbers
                neg++;
            } else {
                //Count of zero values
                zero++;
            }

            //Count of even numbers
            if(num % 2==0){
                even++;
            }else{
                //Count of odd numbers
                odd++;
            }
        }
        System.out.println("Positive Numbers: "+pos);
        System.out.println("Negative Numbers: "+neg);
        System.out.println("Zeros: "+zero);
        System.out.println("Even Numbers: "+even);
        System.out.println("Odd Numbers: "+odd);

        //Search System
        int number;
        int firstIndex = -1;
        int appear = 0;

        //Ask the user to enter a number
        IO.println("Please enter a number: ");
        number = Integer.parseInt(IO.readln());

        //Check if the number exists in the array
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == number){
                //Check if the number exists in the array
                if(firstIndex == -1){
                    firstIndex = i;
                }
                appear++;
            }

        }
        if(appear > 0){
            //Display the index position & Display how many times it appears
            System.out.println("First index: "+firstIndex);
            System.out.println("Occurrences: "+appear);
        }else{
            //Display "Number not found"
            System.out.println("Number not found");
        }

        //Create logic to display the array in reverse order without creating a new array
        System.out.println("Original:\n" + Arrays.toString(numbers));
        System.out.print("Reverse:\n[");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + (i > 0 ? ", " : ""));
        }
        System.out.println("]");

        //Create a copy of the original array
        int [] sortedNumbers = Arrays.copyOf(numbers, numbers.length);

        //Sort the copied array from smallest to largest
        System.out.println("Sorted Array: ");
        System.out.println(Arrays.toString(sortedNumbers));

        //Compare the first and last values of the sorted array
        System.out.println("Smallest value: "+sortedNumbers[0]);
        System.out.println("Largest value: "+sortedNumbers[sortedNumbers.length-1]);




    }
}
