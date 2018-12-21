package org.cap.service;

import java.util.List;

import org.cap.dao.IStudentDao;
import org.cap.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentDao studentDao;
	
	@Override
	public List<Student> getStudents() {
		
		return studentDao.getStudents();
	}

	@Override
	public Student findStudent(Integer studId) {
		
		return studentDao.findStudent(studId);
	}

	@Override
	public void update(Student student) {
		studentDao.update(student);
	}

}
