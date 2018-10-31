package com.example.student.web.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.student.web.model.Todo;

@Service
public class TodoService {
	
	
	
	private static int totalCount=3;
	private static List<Todo>  list=new ArrayList<>();
	 
	static
	{
		list.add(new Todo(1,"course","java",new Date(),false));
		list.add(new Todo(2,"course","java",new Date(),false));
		list.add(new Todo(3,"course","java",new Date(),false));
	}
	
	public List<Todo>  retrive(String user)
	{
		List<Todo> listTodo=new ArrayList<>();
		
		for(Todo todo:list) {
			if(todo.getUser().equals(user))
			{
				listTodo.add(todo);
			}
		}
		 return listTodo;
	}
	
	
	

}
