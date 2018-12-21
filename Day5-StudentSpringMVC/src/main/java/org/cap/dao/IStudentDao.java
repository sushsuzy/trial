package org.cap.dao;

import java.util.List;

import org.cap.model.Student;

public interface IStudentDao {
	
	public List<Student> getStudents();
	public Student findStudent(Integer studId);
	public void update(Student student);
}
