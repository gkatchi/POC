package com.poc.library.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.poc.library.data.model.Book;
import com.poc.library.data.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value = "/getBooks")
	public List<Book> getAllBooks() {
		List<Book> books = bookService.getAllBooks();
		return books;
	}

	@PostMapping(value = "/savebook") public void addBook(@RequestBody Book book)
	  { 
		
		bookService.saveBook(book); 
	  }
	@PutMapping(value = "/modifybook") public void modifyBook(@RequestBody Book book)
	  { 
		
		bookService.updateBook(book);
	  }
	@DeleteMapping(value="/deleteBook")
	public void deleteBook(@RequestBody Book book) {
		bookService.deleteBook(book);
	}
}
