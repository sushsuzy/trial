package org.cap.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue
	@Column(name="studId")
	private int stduentId;
	
	@Column(name="studName")
	private String studentName;
	
	@Column(name="studLocation")
	private String location;
	
	
	public Student() {
		
	}
	
	public Student(int stduentId, String studentName, String location) {
		super();
		this.stduentId = stduentId;
		this.studentName = studentName;
		this.location = location;
	}
	public int getStduentId() {
		return stduentId;
	}
	public void setStduentId(int stduentId) {
		this.stduentId = stduentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Student [stduentId=" + stduentId + ", studentName=" + studentName + ", location=" + location + "]";
	}
	
	

}
