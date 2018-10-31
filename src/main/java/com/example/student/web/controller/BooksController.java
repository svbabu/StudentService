package com.example.student.web.controller;

import java.util.Arrays;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.web.model.Books;

@RestController
public class BooksController {
	
	@GetMapping("/books")
	
	public List<Books>  getAllBooks()
	{
	return  Arrays.asList();
	}
	
	@RequestMapping(value="/insert/{id}/{name}/{author}" ,method=RequestMethod.POST)
	

	public String  insertBooks(@RequestParam("id") long id,@RequestParam("name") String name,
			@RequestParam("author") String  author)
	{
		return id+" "+name+" "+author;
	}
		
		/*Arrays.asList(new Books(id,name,author));
		Arrays.asList(new Books(101,"Spring course 4.0V","John Hosly"));
		Arrays.asList(new Books(101,"Spring course 4.0V","John Hosly"));
		*/
	}


