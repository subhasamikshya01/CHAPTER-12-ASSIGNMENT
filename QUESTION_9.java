package QUESTION_9;

import java.util.List;

interface EnrollmentSystem{
	void enrollStudent(Student s,Course c);
	void dropStudent(Student s,Course c);
	void displayEnrollmentDetails();
}
class Student{
	public Student(String n, String sid) {
		super();
		this.n = n;
		this.sid = sid;
	}

	public String getN() {
		return n;
	}

	public void setN(String n) {
		this.n = n;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	private String n,sid;
	
}
class Course{
	public Course(String cid, String cn) {
		super();
		this.cid = cid;
		this.cn = cn;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCn() {
		return cn;
	}

	public void setCn(String cn) {
		this.cn = cn;
	}

	private String cid,cn;
}
class Enrollment implements EnrollmentSystem{
	public Enrollment() {
		super();
		this.es = es;
		this.ec = ec;
	}

	public List<Student> getEs() {
		return es;
	}

	public void setEs(List<Student> es) {
		this.es = es;
	}

	public List<Course> getEc() {
		return ec;
	}

	public void setEc(List<Course> ec) {
		this.ec = ec;
	}

	private List<Student> es;
	private List<Course> ec;
	@Override
	public void enrollStudent(Student s, Course c) {
		es.add(s);
		ec.add(c);
		System.out.println("NAME:- "+s.getN()+" COURSE:- "+c.getCn());
	}

	@Override
	public void dropStudent(Student s, Course c) {
		
	}

	@Override
	public void displayEnrollmentDetails() {
		
	}
	
}
public class QUESTION_9 {

	public static void main(String[] args) {
		Enrollment e=new Enrollment();
		Student s1=new Student("S1","N1");
		Student s2=new Student("S2","N2");
		Student s3=new Student("S3","N3");
		Student s4=new Student("S4","N4");
		Course c1=new Course("CN1","CID1");
		Course c2=new Course("CN2","CID2");
		Course c3=new Course("CN3","CID3");
		Course c4=new Course("CN4","CID4");
	}

}
