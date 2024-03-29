package com.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student_details")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String sname;
	private int sage;
	
	public int getSid()
	{
	return sid;
	}
	public void setSid(int sid)
	{
		this.sid=sid;
	}
	
	public String getSname()
	{
		return sname;
	}
	public void setSname(String sname)
	{
		this.sname=sname;
	}
	public int getSage()
	{
		return sage;
	}
	public void setSage(int sage)
	{
		this.sage=sage;
	}
	public Student(int sid, String sname, int sage) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
	}
	public Student() {
		super();
	}
	

}
