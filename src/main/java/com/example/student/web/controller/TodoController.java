package com.example.student.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.student.web.service.TodoService;

@Controller
@SessionAttributes("name")
public class TodoController {
	
	@Autowired
	TodoService service;
	
	@RequestMapping(value="/todo-list",   method=RequestMethod.POST)
	public String todoList(ModelMap model)
	{
		String name=(String) model.get("name");
		
		model.put("todos",service.retrive(name) );
		return "list-todos";
	}

}
