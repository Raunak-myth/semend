package testing;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


@Entity
@Table(name="COURSE")
public class Course {
	
	@Id @GeneratedValue(generator = "newGenerator") //name of primary key generator
	@GenericGenerator(name = "newGenerator", strategy = "foreign",parameters = { @Parameter(value="student",name="property")})
	private int student_id;
	private int course1;
	private int course2;
	private int course3;
	private int course4;
	private int course5;
	private int course6;
	private int finalMarks;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_id")
	private Student student;

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public int getCourse1() {
		return course1;
	}

	public void setCourse1(int course1) {
		this.course1 = course1;
	}

	public int getCourse2() {
		return course2;
	}

	public void setCourse2(int course2) {
		this.course2 = course2;
	}

	public int getCourse3() {
		return course3;
	}

	public void setCourse3(int course3) {
		this.course3 = course3;
	}

	public int getCourse4() {
		return course4;
	}

	public void setCourse4(int course4) {
		this.course4 = course4;
	}

	public int getCourse5() {
		return course5;
	}

	public void setCourse5(int course5) {
		this.course5 = course5;
	}

	public int getCourse6() {
		return course6;
	}

	public void setCourse6(int course6) {
		this.course6 = course6;
	}

	public int getFinalMarks() {
		return finalMarks;
	}

	public void setFinalMarks(int finalMarks) {
		this.finalMarks = finalMarks;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	
}
