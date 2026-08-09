package LibraryCatalogue;

public class Book implements LIBRARYITEM{
    private String title;
    private String author;
    private Integer pages;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title != null && !title.trim().isEmpty()){
            this.title = title;
        }else{
            System.out.println("Name cannot be empty");
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        if(pages != null && pages > 0){
            this.pages = pages;
        }else{
            this.pages = 0;
            System.out.println("Pages must be above 0");
        }
    }

    @Override
    public void printAllInfo() {
        IO.println("Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                '}');
    }

    @Override
    public String getLabel() {
        return title;
    }

    @Override
    public String getShelfCode() {
        return "Shelf B-01";
    }
}
