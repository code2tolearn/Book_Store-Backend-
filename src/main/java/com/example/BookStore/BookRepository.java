package com.example.BookStore;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class BookRepository {
    HashMap<String , Book > bookdb  ;
    HashMap<String ,Author> authordb ;

    public BookRepository(HashMap<String, Book> bookdb, HashMap<String, Author> authordb) {
        this.bookdb = bookdb;
        this.authordb = authordb;
    }
    public String addBook(Book book){
        if(bookdb.containsKey(book.getName())) return "Already Exist"  ;
         bookdb.put(book.getName() , book ) ;
        return "Successfully Added"  ;
    }

    public  String addAuthor(Author author)
    {
        if(authordb.containsKey(author.getName())) return "Author is alrady exist" ;
        authordb.put(author.getName() , author) ;
        return "Added Successfully " ;
    }
    public Book getBookWithHighestPage()
    {
        Book b1 = null  ;
        int maxpage =  0 ;
        for(Book book : bookdb.values())
        {
            if(book.getPages() > maxpage)
            {
                maxpage = book.getPages() ;
               b1 = book ;
            }
        }
        return b1 ;
    }

    public String  updateBook(String name , int page )
    {
           if(!bookdb.containsKey(name)) return "Book not exist in Db" ;
           Book book1 =   bookdb.get(name) ;
          book1.setPages( book1.getPages()+page);
          bookdb.put(name , book1) ;
          return "Pages added Successfully " ;
    }
    public  Author getAuthorWrittenHighestPages()
    {    Author author = null ;
         int maxpage = 0 ;
         for(Author author1: authordb.values())
         {
             if(author1.getNoOfPages() > maxpage )
             {
                 maxpage = author1.getNoOfPages() ;
                 author = author1 ;
             }
         }
         return author ;
    }
}
