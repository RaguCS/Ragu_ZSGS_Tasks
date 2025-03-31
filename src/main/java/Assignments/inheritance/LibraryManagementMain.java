package Assignments.inheritance;

import java.util.List;

public class LibraryManagementMain {
    public static void main(String[] args) {

    }
}
class LibraryManagementSystem {
    String userType;
    String username;
    String password;

    void login() {}
    void register() {}
    void logout() {}
}


class User {
    String name;
    int id;
    Account account;

    void verify() {}
    void checkAccount() {}
    void getBookInfo() {}
}


class Staff extends User {
    String dept;
}


class LStudent extends User {
    String studentClass;
}


class Account {
    int noBorrowedBooks;
    int noReservedBooks;
    int noReturnedBooks;
    int noLostBooks;
    double fineAmount;

    void calculateFine() {}
}

class Book {
    String title;
    String author;
    String ISBN;
    String publication;

    void showDue() {}
    void checkReservationStatus() {}
    void provideFeedback() {}
    void requestBook() {}
    void renewInfo() {}
}

class Librarian {
    String name;
    int id;
    String password;
    String searchString;

    void verifyLibrarian() {}
    void search() {}
}

class LibraryDatabase {
    List<Book> listOfBooks;

    void add(Book book) {}
    void delete(Book book) {}
    void display() {}
    void search(String query) {}
}

