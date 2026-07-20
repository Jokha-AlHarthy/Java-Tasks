import java.util.ArrayList;
import java.util.Collections;

public class ScoreAnalysis {
    public static void main(String[] args){
        //Create Score List
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(85);
        scores.add(70);
        scores.add(95);
        scores.add(100);
        scores.add(88);
        scores.add(80);
        scores.add(75);
        scores.add(77);
        scores.add(50);
        scores.add(60);
        scores.add(10);
        scores.add(99);
        scores.add(89);
        scores.add(98);

        //Display Student Information
        //1. Total number of students
        System.out.println("Total number of scores: "+scores.size());

        //2. All student names with their indexes
        for(int i = 0; i < scores.size(); i++){
            System.out.println("Score "+i+": "+scores.get(i));
        }

        //Calculate Score Statistics

        //1. Total score
        int sum = 0;
        for(int i = 0; i<scores.size(); i++){
            sum += scores.get(i);
        }
        System.out.println("The total score is: "+sum);

        //2. Average score (must use type casting to display decimal  values)
        double average = (double) sum / scores.size();
        System.out.println("Average: " + average);

        //3. Highest score & Lowest score
        int highest = scores.get(0);
        int lowest = scores.get(0);
        for(int score: scores){
            if(score > highest){
                highest = score;
            }
            if (score<lowest){
                lowest = score;
            }
        }
        System.out.println("Highest Score:"+highest);
        System.out.println("Lowest Score: "+lowest);

        //Score Classification
        int passCount= 0;
        int failedCount=0;
        int excellentCount=0;
        int lowCount=0;
        for(int score: scores){
            //Number of students who passed (score >= 60)
            if(score>= 60){
                passCount++;

            }
            //Number of students who failed (score < 60).
            if (score<60) {
                failedCount++;

            }
            //Number of students with excellent grades (score >= 90)
            if (score>=90) {
                excellentCount++;
            }
            //Number of students with low grades (score < 50)
            if(score<50){
                lowCount++;
            }
        }
        System.out.println("Passed: "+passCount);
        System.out.println("Failed: "+failedCount);
        System.out.println("Excellent: "+excellentCount);
        System.out.println("Low Grades: "+lowCount);

        //Search Score System
        //1. Ask the user to enter a score
        IO.println("Please enter a score:  ");
        int searchScore = Integer.parseInt(IO.readln());
        int searchIndex = scores.indexOf(searchScore);

        //2. Check if the score exists in the list
        if(searchIndex != -1){
            int occurrences = 0;
            for(int score: scores){
                if(score==searchScore){
                    occurrences++;
                }
            }
            System.out.println("Score found");
            System.out.println("First Position: "+searchIndex);
            System.out.println("Occurrences: "+ occurrences);
        }else{
            System.out.println("Score not found");
        }

        //Update Score System
        //1. Ask the user for the score index
        IO.println("Please enter the index position: ");
        int index = Integer.parseInt(IO.readln());

        //2. Ask for the new score value
        IO.println("Please enter the new score: ");
        int newScore = Integer.parseInt(IO.readln());

        //2. Replace the old score with a new score
        if (index >= 0 && index < scores.size()) {
            scores.set(index, newScore);
            System.out.println("Updated list: " + scores);
        } else {
            System.out.println("Invalid index!");
        }

        //3. Display the updated ArrayList
        System.out.println("Updated list: "+scores);

        //Remove Score System
        //1. Remove a score by value
        IO.println("Please enter score you want to remove: ");
        int removeScore= Integer.parseInt(IO.readln());
        if(scores.remove(Integer.valueOf(removeScore))){
            System.out.println("Score "+removeScore+" removed from the list");
        }else{
            System.out.println("Score not found");
        }
        System.out.println("Current list"+scores);

        //2. Remove a score by index
        IO.println("Please enter index of the score");
        int removeIndex = Integer.parseInt(IO.readln());
        if(removeIndex>= 0 && removeIndex< scores.size()){
            int removedName = scores.remove(removeIndex);
            System.out.println("Student "+removedName+" at index "+removeIndex);
        }else{
            System.out.println("Student not found");
        }

        //3. Display the list after removal
        System.out.println("Updated list"+scores);


        //Sorting and Reversing Scores
        //1. Create a copy of the score list
        ArrayList<Integer>sortedScore = new ArrayList<>(scores);

        //2. Sort scores from smallest to largest
        Collections.sort(sortedScore);

        //3. Display sorted scores
        System.out.println(sortedScore);

        //4. Reverse the sorted list
        System.out.println("Descending: "+sortedScore.reversed());

        //5.  Display highest to lowest scores
        System.out.println("Ascending: "+sortedScore);

        //Clear Score Data
        //1. Removes all scores from the list
        scores.clear();
        //2. Displays the empty list
        System.out.println("After clear"+scores);

        //3. Checks if the list is empty
        System.out.println("The list is empty "+scores.isEmpty());
    }
}
