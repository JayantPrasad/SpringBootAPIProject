package com.prasadJayant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prasadJayant.repo.LibraryRepo;
@RestController
public class LibControler {
	@Autowired
	LibraryRepo libraryRepository;
	
	@PostMapping("/addBook")
	public ResponseEntity addBookImp (@RequestBody Library library) {
		// Implementation for adding a book
		AddBookResponse addBookResponse = new AddBookResponse();
		library.setId(library.getIsbn() + library.getAisle());
		libraryRepository.save(library);
		addBookResponse.setId(library.getIsbn() + library.getAisle());
		addBookResponse.setMessage("Book is added successfully");
		return new ResponseEntity<AddBookResponse>(addBookResponse, org.springframework.http.HttpStatus.CREATED);
		
		
	}	


	

}
