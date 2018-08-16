package task2SortingExamPapers;
/**
 * This class just shows a student's attributes which assignment require us to do.
 * It also has the getter and setter for each attribute.
 * @author RuotongXu
 *
 */
public class Student {
	private int id;
	private String fname;
	private String lname;
	private int uniyear;
	private String program;
	public Student(String fname,String lname,String program) {
		this.fname = fname;
		this.lname = lname;
		this.program = program;
		this.id = 1000;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getUniyear() {
		return uniyear;
	}
	public void setUniyear(int uniyear) {
		this.uniyear = uniyear;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
}
