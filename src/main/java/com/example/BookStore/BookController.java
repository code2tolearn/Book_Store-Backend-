package com.example.BookStore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {
    @Autowired
    BookService bookService ;
     /* Create an author and book management system which can help us easily to perform CRUD operations.POST :Add book(been there), add author
GET : the bookName with highest no. of pages.
PUT the (path bookname, updated pages);
GET author who has written the highest no. of pages */
    // add book
    @PostMapping("/add-book")
     public ResponseEntity<String> addBook(@RequestBody Book book)
    {
         return new ResponseEntity(bookService.addBook(book), HttpStatus.FOUND) ;
    }

    // add AUTHOR
    @PostMapping("/add-author")
    public ResponseEntity<String> addAuthor(@RequestBody Author author)
    {
        return new ResponseEntity(bookService.addAuthor(author), HttpStatus.FOUND) ;
    }
    // GET : the bookName with highest no. of pages.
    @GetMapping("/get-bookwith-highestpage")
    public  ResponseEntity<Book> getBookWithHighestPage()
    {
        return new ResponseEntity<>(bookService.getBookWithHighestPage(),HttpStatus.FOUND) ;
    }
    // GET : the bookName with highest no. of pages.
    @PutMapping("/update-book")
    public ResponseEntity<String> updateBook(@RequestParam("name") String name , @RequestParam("page") String page )
    {
         return new  ResponseEntity<>(bookService.updateBook(name , page),HttpStatus.FOUND) ;
    }
    /*GET author who has written the highest no. of pages */
    @GetMapping("/get-author-with-highest-pages")
    public ResponseEntity<Author> getAuthorWrittenHighestPages()
    {
         return new ResponseEntity<>(bookService.getAuthorWrittenHighestPages(),HttpStatus.FOUND) ;
    }

}
