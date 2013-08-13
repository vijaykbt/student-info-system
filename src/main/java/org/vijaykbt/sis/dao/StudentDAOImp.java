package org.vijaykbt.sis.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.vijaykbt.sis.model.Student;

public class StudentDAOImp extends HibernateDaoSupport implements StudentDAOInf {

	@Override
	public void save(Student std) {
		getHibernateTemplate().save(std);
	}

	@Override
	public void update(Student std) {
		getHibernateTemplate().update(std);
	}

	@Override
	public void delete(Student std) {
		getHibernateTemplate().delete(std);		
	}

	@Override
	public Student findStudentById(int id) {
		List list = getHibernateTemplate().find("from student where stdId=?", id);
		return (Student)list.get(0);
	}

}
