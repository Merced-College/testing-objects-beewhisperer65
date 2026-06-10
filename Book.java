public class Book {
    private String title;
    private int pages;
    private String author; // Three data points, two string and one int.

    public Book() { // Default state
        title = "Unknown";
        pages = -1;
        author = "Anonymous";
    }

    public Book(String title, int pages, String author) { // Give me all the input right off the bat
        this.title = title;
        this.pages = pages;
        this.author = author;
    }

    @Override // Compiler checks to make sure it's actually finding the default setting
    public String toString() { // Our way of printing this object
        return "Book{title='" + title + "', pages=" + pages + ", author='" + author + "'}";
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public int getPages() { return pages; }
    public void setPages(int pages) { this.pages = pages; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; } // Setters and getters
}
