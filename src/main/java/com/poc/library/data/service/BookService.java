package com.poc.library.data.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.poc.library.data.model.Book;
import com.poc.library.data.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public List<Book> getAllBooks() {

		return bookRepository.findAll();
	}

	public void saveBook(Book book) {
		bookRepository.save(book);
	}
	
	public void updateBook(Book book) {
		Book bookloc=bookRepository.findByTitle(book.getTitle());
		if(bookloc!=null) {
			bookloc.setAvailable(book.getAvailable());
			bookloc.setCover(book.getCover());
			bookloc.setPages(book.getPages());
			bookloc.setPublisher(book.getPublisher());
			bookloc.setTitle(book.getTitle());
			bookRepository.save(bookloc);
		}else {
			bookRepository.save(book);
		}
		
	}
	
	public void deleteBook(Book book) {
		bookRepository.delete(bookRepository.findByTitle(book.getTitle()));
	}

}
