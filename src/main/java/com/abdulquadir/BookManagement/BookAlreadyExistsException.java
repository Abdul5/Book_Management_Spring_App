package com.abdulquadir.BookManagement;

public class BookAlreadyExistsException extends RuntimeException{
    public BookAlreadyExistsException(int id) {
        super("Book for id: " + id + " already exists in database");
    }
}
