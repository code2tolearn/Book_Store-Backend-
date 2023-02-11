package com.example.BookStore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository ;


    public  String addBook(Book book)
    {
        return bookRepository.addBook(book) ;
    }

    // add author
    public  String addAuthor(Author author)
    {
        return bookRepository.addAuthor(author) ;
    }

    // get book with highest pages
     public Book getBookWithHighestPage()
     {
         return  bookRepository.getBookWithHighestPage() ;
     }
     // update book
    public String  updateBook(String name , String page )
    {
            int p =  Integer.parseInt("page") ;
            return bookRepository.updateBook(name , p );
    }
    // author with highest pages
    public  Author getAuthorWrittenHighestPages()
    {
        return bookRepository.getAuthorWrittenHighestPages() ;
    }
}
