public class Book {
    //Add two attributes: String title and String author
    String title;
    String author;

    //Add one behaviour (method): printInfo() that prints the title and the author
    public void printInfo(){
        IO.println("Title of book: "+title);
        IO.println("Author of the book: "+author);
        IO.println("\n");
    }

    public static void main(String[] args){
        // Inside main, build one object: Book b = new Book();
        Book b = new Book();
        b.title = "Java Basics";
        b.author = "Maryam";

        Book b1 = new Book();
        b1.title = "Python";
        b1.author = "by Ishaq";

        Book b2 = new Book();
        b2.title = "C++";
        b2.author = "by Fatma";

        Book b3 = new Book();
        b3.title = "JavaScript";
        b3.author = "by Salim";

        b.printInfo();
        b1.printInfo();
        b2.printInfo();
        b3.printInfo();
    }
}
