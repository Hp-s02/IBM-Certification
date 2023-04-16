package com.example.demo.exception;

public class TodoCollectionException extends Exception {
	
	public TodoCollectionException(String message){
		super(message);
	}
	
	public static String NotFoundException(String id) {
		return "Todo with " + id + " Not found";
	}
	
	public static String TodoAlreadyExists() {
		return "Todo with given name already exists";
	}
}
