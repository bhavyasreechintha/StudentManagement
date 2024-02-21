package com.student.exception;

public class StudentsNotFoundException extends RuntimeException {



/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String message;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public StudentsNotFoundException(String message) {
	super();
	this.message = message;
}

}
