package com.student.exception;

import java.util.Date;

public class ErrorResponse {

	private int status;
	private String message;
	private Date TimeStamp;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public ErrorResponse(int status, String message, Date timeStamp) {
		super();
		this.status = status;
		this.message = message;
		TimeStamp = timeStamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getTimeStamp() {
		return TimeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		TimeStamp = timeStamp;
	}
}
