package com.example.BookStore;

public class Author {
    String name ;

    int noOfPages  ;

    public Author(String name, int noOfPages) {
        this.name = name;
        this.noOfPages = noOfPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }
}
