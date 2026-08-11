public class Book {
    //Add two attributes: String title and String author
    String title;
    String author;

    //Add one behaviour (method): printInfo() that prints the title and the author
    public void printInfo(){
        IO.println("Title of book: "+title);
        IO.println("Author of the book: "+author);
    }

    public static void main(String[] args){
        // Inside main, build one object: Book b = new Book();
        Book b = new Book();
        b.title = "Java Basics";
        b.author = "Maryam";
        b.printInfo();
    }
}
