package org.vijaykbt.sis.dao;

import org.vijaykbt.sis.model.Student;

public interface StudentDAOInf {
	void save(Student std);
	void update(Student std);
	void delete(Student std);
	Student findStudentById(int id);
}
