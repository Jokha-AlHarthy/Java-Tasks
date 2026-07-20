import java.util.ArrayList;

public class LibraryBookSystem {
    public static void main(String[] args){
        //Create the following ArrayLists

        //1. Book title
        ArrayList<String> bookTitles = new ArrayList<>();

        //2. Author name
        ArrayList<String> authors = new ArrayList<>();

        //3. Availability status
        ArrayList<Boolean> availability = new ArrayList<>();

        //Store information for at least 10 books
        bookTitles.add("Java Programming");
        authors.add("James");
        availability.add(true);

        bookTitles.add("Clean Code");
        authors.add("Robert");
        availability.add(true);

        bookTitles.add("Design Patterns");
        authors.add("Erich");
        availability.add(false);

        bookTitles.add("Data Structures");
        authors.add("Mark");
        availability.add(true);

        bookTitles.add("Effective Java");
        authors.add("Joshua");
        availability.add(true);

        bookTitles.add("Head First Java");
        authors.add("Kathy");
        availability.add(false);

        bookTitles.add("Spring in Action");
        authors.add("Craig");
        availability.add(true);

        bookTitles.add("Database Concepts");
        authors.add("Abraham");
        availability.add(true);

        bookTitles.add("Operating Systems");
        authors.add("Silberschatz");
        availability.add(false);

        bookTitles.add("Computer Networks");
        authors.add("Andrew");
        availability.add(true);

        //Display Library Books
        for(int i=0; i < bookTitles.size(); i++){
            //1. Book index
            System.out.println("Book "+i+": ");

            //2. Book title
            System.out.println("Title: "+bookTitles.get(i));

            //3. Author
            System.out.println("Name: "+authors.get(i));

            //4. Availability status
            System.out.println("Availability: "+availability.get(i));
        }

        //Add New Book
        //1. Ask the user for book title
        IO.println("Enter Book Title: ");
        String bookTitle = IO.readln();
        //2. Ask for author name
        IO.println("Enter Author: ");
        String authorName = IO.readln();
        //3. Ask for availability status
        IO.println("Available: ");
        boolean available = Boolean.parseBoolean(IO.readln());

        //4. Add the book information to the lists
        bookTitles.add(bookTitle);
        authors.add(authorName);
        availability.add(available);
        System.out.println("Book added successfully");

        //Update Book Information
        //1. Ask the user for the book index
        IO.println("Please enter the index position: ");
        int index = Integer.parseInt(IO.readln());

        //2. Replace the old book info with a book info
        if (index >= 0 && index < bookTitles.size()) {
            //A. Allow updating Book title
            IO.println("New Title: ");
            String updatedTitle= IO.readln();

            //B. Allow updating Author name
            IO.println("New Author: ");
            String updatedAuthor = IO.readln();

            //C. Allow updating Availability status
            IO.println("Available: ");
            boolean updatedAvailability = Boolean.parseBoolean(IO.readln());

            bookTitles.set(index, updatedTitle);
            authors.set(index,updatedAuthor);
            availability.set(index, updatedAvailability);
            System.out.println("Book updated successfully");
        } else {
            System.out.println("Invalid index!");
        }

        //Search Book System
        //1. Ask the user to enter a book title
        IO.println("Please enter book title you want to search for: ");
        String searchBook = IO.readln();

        //2. Check if the product exists
        int searchIndex = -1;
        for (int i = 0; i < bookTitles.size(); i++) {
            if (bookTitles.get(i).equals(searchBook)){
                searchIndex = i;
                break;
            }
        }
        if (searchIndex != -1) {
            //Display Employee name, Employee salary & Employee position in the list
            System.out.println("Book index:  " + searchIndex);
            System.out.println("Author name:  " + authors.get(searchIndex));
            System.out.println("Availability status: " + availability.get(searchIndex));
        } else {
            System.out.println("Book not found");
        }
    }
}
