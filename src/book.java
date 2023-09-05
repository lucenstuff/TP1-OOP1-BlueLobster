public class book {
    private String title;
    private String author;
    private int copies;
    private int loans;

    public book() {
    }

    public book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public int getBorrowed() {
        return loans;
    }

    public void setBorrowed(int borrowed) {
        this.loans = borrowed;
    }

    public boolean borrowBook(){
        if (copies > 0){
            loans++;
            return true;
        }
        return false;
    }

    public boolean returnBook(){
        if (loans > 0){
            loans--;
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", numberOfCopies=" + copies +
                ", numberOfLoans=" + loans +
                '}';
    }

}
