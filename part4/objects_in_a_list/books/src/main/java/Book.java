public class Book {
    private String title;
    private int pages;
    private Integer publicationYear;

    public Book(String title, int pages, int publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPages() {
        return this.pages;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public String toString() {
        return getTitle() + ", " + getPages() + ", " + getPublicationYear();
    }
}