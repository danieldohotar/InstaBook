package com.instabook.service;

import com.instabook.dao.BookRepository;
import com.instabook.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> listAll(){

        return bookRepository.findAll();
    }

    public void save(Book book){
        bookRepository.save(book);
    }

    public Book get(Long id){
        return bookRepository.findById(id).get();
    }

    public void delete(Long id) {
        bookRepository.deleteById(id);
    }
}
