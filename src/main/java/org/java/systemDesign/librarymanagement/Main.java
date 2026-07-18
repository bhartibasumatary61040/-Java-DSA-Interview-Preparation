package org.java.systemDesign.librarymanagement;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new Book(101, "Java Programming", "James Gosling"));
        library.addBook(new Book(102, "Clean Code", "Robert Martin"));
        library.addBook(new Book(103, "Effective Java", "Joshua Bloch"));

        library.displayBooks();

        library.issueBook(102);

        library.displayBooks();

        library.returnBook(102);

        library.displayBooks();
    }
}
