import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BookStackManager {
    //Create the main method inside the class
    public static void main(String[] args){
        //Create a Stack<String> to store
        Deque<String> bookTitles = new ArrayDeque<>();

        //Prompt the user to enter the number of books using a Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of books: ");
        int numOfBooks = input.nextInt();

        //checking If the entered number is less than or equal to 0
        if(numOfBooks<= 0){
            System.out.println("Invalid number of books");
        }else{
            //Use a for loop to read each book title
            for(int i=0; i < numOfBooks; i++){
                //Add each book to the stack using the push() method
                System.out.println("Enter book title: ");
                String title = input.next();
                bookTitles.push(title);
            }
            System.out.println(bookTitles);

            //Display the following menu using a do-while loop
            int choice;
            do{
                System.out.println("1. Add Book");
                System.out.println("2. Remove Top Book");
                System.out.println("3. View Top Book");
                System.out.println("4. Search Book");
                System.out.println("5. Display All Books");
                System.out.println("6. Display Stack Statistics");
                System.out.println("7. Exit");

                System.out.println("Please enter a number from the list: ");
                choice = input.nextInt();

                switch (choice){
                    case 1: //Add Book
                        System.out.println("Search for the book title: ");
                        String searchBook = input.next();
                        if(bookTitles.contains(searchBook)){
                            System.out.println("Book already exists");
                        }else{
                            System.out.println("Please enter new book title");
                            String newBook = input.next();
                            bookTitles.push(newBook);
                            System.out.println("Book added successfully..");
                        }
                        break;
                    case 2: //Remove Top Book
                        if(bookTitles.isEmpty()){
                            System.out.println("No books available");
                        }else{
                            System.out.println("Removed book: "+ bookTitles.pop());
                        }
                        break;
                    case 3: //View Top Book
                        if(bookTitles.isEmpty()){
                            System.out.println("No books available");
                        }else{
                            System.out.println("The book in the top is: "+bookTitles.peek());
                        }
                        break;
                    case 4: // Search Book
                        System.out.println("Please enter book title you want to search for: ");
                        String bookTitle = input.next();
                        if(bookTitles.contains(bookTitle)){
                            System.out.println("Book found"+bookTitle);
                        }else{
                            System.out.println("Book not found");
                        }
                        break;
                    case 5: //Display All Books
                        for(String title : bookTitles){
                            System.out.println("Books available are: "+title);
                        }
                        break;
                    case 6: //Display Stack Statistics
                        System.out.println("Total number of books"+ bookTitles.size());
                        System.out.println("Top book: "+bookTitles.peek());
                        System.out.println("Whether the stack is empty: "+bookTitles.isEmpty());
                        break;
                    case 7: //Exit
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Invalid Number ");
                }

            }while(choice!= 7);
        }
        input.close();
    }
}
