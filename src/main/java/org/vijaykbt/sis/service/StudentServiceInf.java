package org.vijaykbt.sis.service;

import org.vijaykbt.sis.model.Student;

public interface StudentServiceInf {
	void save(Student std);
	void update(Student std);
	void delete(Student std);
	Student findStudentById(int id);
}
