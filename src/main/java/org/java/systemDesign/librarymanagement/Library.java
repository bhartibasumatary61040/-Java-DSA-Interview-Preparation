package org.java.systemDesign.librarymanagement;
import java.util.ArrayList;
import java.util.List;
public class Library {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {

        books.add(book);

        System.out.println(book.getTitle() + " added successfully.");
    }

    public void issueBook(int bookId) {

        for (Book book : books) {

            if (book.getId() == bookId) {

                if (!book.isIssued()) {

                    book.issueBook();

                    System.out.println(book.getTitle() + " issued successfully.");

                } else {

                    System.out.println("Book already issued.");
                }

                return;
            }
        }

        System.out.println("Book not found.");
    }

    public void returnBook(int bookId) {

        for (Book book : books) {

            if (book.getId() == bookId) {

                if (book.isIssued()) {

                    book.returnBook();

                    System.out.println(book.getTitle() + " returned successfully.");

                } else {

                    System.out.println("Book was not issued.");
                }

                return;
            }
        }

        System.out.println("Book not found.");
    }

    public void displayBooks() {

        System.out.println("\nLibrary Books");

        for (Book book : books) {

            System.out.println(book);
        }
    }
}
