package task2SortingExamPapers;
import java.util.Random;

public class StudentListSort {
	private Student[] studentlist;
	private int size = 51;
	public int elementCount =0;
	public StudentListSort() {
		studentlist = new Student[size];
	}
	public void addStudent(Student student) {
		Random ra = new Random();
		boolean duplicate = false;
		for(int i = elementCount+1;i>elementCount;i--) {
			this.studentlist[i] = student;
			do {
				int tempid = ra.nextInt(100)+1;
				if(this.hasID(tempid)==false){
					this.studentlist[i].setId(tempid);
				     duplicate = false;
				}
				else {
					duplicate = true;
				}
				
			} while(duplicate == true);
			this.studentlist[i].setUniyear(ra.nextInt(3)+1);
			elementCount++;
		}
	}
	private boolean hasID(int id) {
		for(int i = 1;i<elementCount;i++) {
			if(this.studentlist[i].getId()==id) {
				
				return true;
			}
		}
		return false;
	}
	public Student[] getStudentList() {
		return this.studentlist;
	}
}
