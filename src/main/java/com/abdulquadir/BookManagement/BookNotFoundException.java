package com.abdulquadir.BookManagement;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(int id) {
        super("Book does not exist for id : " + id);
    }
}
