import java.util.HashMap;
import java.util.HashSet;

public class LibraryBookTracker {
    //Create the main method inside the class
    public static void main(String[] args){

        //A HashSet<Integer> to store unique book IDs
        HashSet<Integer> uniqueBookId = new HashSet<>();

        //A HashMap<Integer, String> to store book IDs as keys and book titles asvalues
        HashMap<Integer, String> bookId = new HashMap<>();

        //ask the user to enter the number of books
        IO.println("Enter the number of the books: ");
        int NumOfBook = Integer.parseInt(IO.readln());

        //checking If the entered number is less than or equal to 0
        int totalEntered = 0;
        if(NumOfBook<=0){
            IO.println("Invalid number of books");
        }else{
            //Use a for loop to read each book ID and book title
            for(int i=0; i<NumOfBook; i++){
                //Check whether the book ID already exists in the HashSet.
                IO.println("Enter the book Id: ");
                int IdOfBook = Integer.parseInt(IO.readln());

                IO.println("Enter the title of the book: ");
                String titleBook = IO.readln();

                if(!uniqueBookId.add(IdOfBook)){
                    IO.println("Duplicate Book ID. Record not added");
                }else{
                    //Add the ID to the HashSet
                    uniqueBookId.add(IdOfBook);

                    //Add the ID and title to the HashMap
                    bookId.put(IdOfBook, titleBook);
                }
                totalEntered++;
            }

            //Checking if the ID exists in the HashMap
            IO.println("Enter the Id you want to search for: ");
            int searchId = Integer.parseInt(IO.readln());
            if(bookId.containsKey(searchId)){
                IO.println("Book Id: "+searchId);
                IO.println("Book title: "+bookId.get(searchId));
            }else{
                IO.println("Book not found");
            }

            //Use an if-else  statement to classify the library
            String classification;
            if(uniqueBookId.size()<5){
                classification = "Small Library";
            } else if (uniqueBookId.size()>= 5 && uniqueBookId.size()<= 10) {
                classification = "Medium Library";
            }else {
                classification = "Large Library";
            }

            //Display the following using System.out.println()
            System.out.println("Total book records entered: "+totalEntered);
            System.out.println("Total unique books: "+bookId.size());
            System.out.println("All book IDs: "+uniqueBookId);
            System.out.println("All book IDs with their corresponding titles: "+bookId);
            System.out.println("Library classification: "+classification);
        }
    }
}
