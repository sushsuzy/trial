package org.cap.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.cap.model.Student;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository("studentDao")
@Transactional
public class StudentDaoImpl implements IStudentDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Student> getStudents() {
		
		List<Student> students
				= entityManager.createQuery("from Student").getResultList();
		return students;
	}

	@Override
	public Student findStudent(Integer studId) {
		Student student= entityManager.find(Student.class, studId);
		return student;
	}

	@Override
	public void update(Student student) {
		Student student1=entityManager.find(Student.class, student.getStduentId());
		if(student1==null)
			entityManager.persist(student);
		else
			entityManager.merge(student);
		
	}

}
