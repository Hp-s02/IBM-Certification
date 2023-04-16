package com.example.demo.service;

import java.util.List;

import com.example.demo.exception.TodoCollectionException;
import com.example.demo.model.TodoDTO;

import jakarta.validation.ConstraintViolationException;

public interface TodoService {

	public void createTodo(TodoDTO todo) throws TodoCollectionException, ConstraintViolationException;
	
	public List<TodoDTO> getAllTodos();
	
	public TodoDTO getSingleTodo(String id) throws TodoCollectionException;
	
	public void updateTodo(String id, TodoDTO todo) throws TodoCollectionException;
	
	public void deleteTodoById(String id) throws TodoCollectionException;
}
