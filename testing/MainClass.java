package testing;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class MainClass {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setStudent_name("Raunak");
		
		Course course = new Course();
		course.setCourse1(20);
		course.setCourse2(20);
		course.setCourse3(20);
		course.setCourse4(20);
		course.setCourse5(20);
		course.setCourse6(20);
		course.setFinalMarks(120);
		
		
		//this is an important step
		course.setStudent(student);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		
		session.save(course);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
