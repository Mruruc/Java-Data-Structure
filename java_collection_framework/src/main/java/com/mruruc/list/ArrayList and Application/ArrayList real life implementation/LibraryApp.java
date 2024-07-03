package Java_Collections;

import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library();


        while (true) {

            System.out.println("Enter 1 to add a book");
            System.out.println("Enter 2 to remove a book");
            System.out.println("Enter 3 to search for a book");
            System.out.println("Enter 4 to quit");

            int i = scanner.nextInt();
            scanner.nextLine();

            switch (i) {
                case 1:
                    System.out.println("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.println("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.println("Enter ISBN number: ");
                    String ISBN = scanner.nextLine();

                    library.addBook(new Library.Book(title, author, ISBN));
                    return;
                case 2:
                    System.out.println("Enter book title: ");
                    title = scanner.nextLine();
                    Library.Book book = library.searchBook(title);
                    if (book != null) {
                        library.removeBook(book);
                        System.out.println("Book removed successfully");
                    } else {
                        System.out.println("Book not found");
                    }
                    return;
                case 3:
                    System.out.println("Enter book title: ");
                    title = scanner.nextLine();

                    book = library.searchBook(title);
                    if (book != null) {
                        System.out.println("Book found!");
                        System.out.println("Title: " + book.getTitle());
                        System.out.println("Author: " + book.getAuthor());
                        System.out.println("ISBN: " + book.getISBN());
                    } else {
                        System.out.println("Book not found");
                    }
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice");
                    scanner.close();


            }
        }


    }
}
