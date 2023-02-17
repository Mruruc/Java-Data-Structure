package Java_Collections;


import java.util.ArrayList;

/*Suppose we have to keep track of a list of books in a library
 and their respective information such as the book title,
 author, and ISBN number. we can use an ArrayList to store this information.*/
public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<Book>();
    }

    public void showAllBooks() {
        for (Book book : books) {
            System.out.print("Book Title: " + book.title + "\nBook Author" + book.author + "\nBook ISBN" + book.ISBN + "\n");
            System.out.println("===========================");
        }
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public Book searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    static class Book {
        private String author;
        private String title;
        private String ISBN;

        public Book(String author, String title, String ISBN) {
            this.author = author;
            this.title = title;
            this.ISBN = ISBN;
        }

        public String getTitle() {
            return this.title;
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

        public String getISBN() {
            return ISBN;
        }

        public void setISBN(String ISBN) {
            this.ISBN = ISBN;
        }
    }

}


