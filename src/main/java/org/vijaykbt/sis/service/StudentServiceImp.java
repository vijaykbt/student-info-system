package org.vijaykbt.sis.service;

import org.vijaykbt.sis.dao.StudentDAOImp;
import org.vijaykbt.sis.model.Student;

public class StudentServiceImp implements StudentServiceInf {
	
	StudentDAOImp	studentDao;

	@Override
	public void save(Student std) {
		studentDao.save(std);
	}

	@Override
	public void update(Student std) {
		studentDao.update(std);
	}

	@Override
	public void delete(Student std) {
		studentDao.delete(std);
	}

	@Override
	public Student findStudentById(int id) {
		return studentDao.findStudentById(id);
	}

	public StudentDAOImp getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDAOImp studentDao) {
		this.studentDao = studentDao;
	}
	
}
