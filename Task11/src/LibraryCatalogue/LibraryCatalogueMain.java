package LibraryCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LibraryCatalogueMain {
    static List<LIBRARYITEM> catalogue = new ArrayList<>();

    static Scanner input = new Scanner(System.in);

    static void main(){
        IO.println("--- Single item created at startup ---");
        Book initialBook = new Book();
        initialBook.setTitle("Clean Code by");
        initialBook.setAuthor("Robert Martin ");
        initialBook.setPages(464);
        initialBook.printAllInfo();
        catalogue.add(initialBook);
        libraryInput();
    }

    public static void libraryInput(){
        Boolean exit = false;
        while (exit == false){
            IO.println("""
                     --- LIBRARY MENU ---
                     1. add book
                     2. add magazine
                     3. print all
                     4. count items
                     5. exit
                     Choose: 
                    """);
            Integer option = input.nextInt();
            if(option.equals(1)){
                catalogue.add(addBook());
            }else if(option.equals(2)){
                catalogue.add(addMagazine());
            } else if (option.equals(3)) {
                int index = 1;
                for(LIBRARYITEM item : catalogue){
                    IO.println(index++ + ". ");
                    item.printAllInfo();
                }
            } else if (option.equals(4)) {
                IO.println("Total Item in catalogue: "+catalogue.size());
            }else if(option.equals(5)){
                exit = true;
            }
        }
    }

    public static Book addBook(){
        Book book =  new Book();
        IO.println("Enter title: ");
        book.setTitle(input.next());
        IO.println("Enter author: ");
        book.setAuthor(input.next());
        IO.println("Enter pages: ");
        book.setPages(input.nextInt());
        book.getLabel();
        book.getShelfCode();
        book.printAllInfo();
        return book;
    }

    public static Magazine addMagazine(){
        Magazine magazine =  new Magazine();
        IO.println("Enter name: ");
        magazine.setName(input.next());
        IO.println("Enter issue number: ");
        magazine.setIssueNumber(input.nextInt());
        IO.println("Enter month: ");
        magazine.setMonth(input.nextInt());
        magazine.getLabel();
        magazine.getShelfCode();
        magazine.printAllInfo();
        return magazine;
    }
}
