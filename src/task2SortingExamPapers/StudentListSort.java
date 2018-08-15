package task2SortingExamPapers;
import java.util.Random;

public class StudentListSort {
	private Student[] studentlist;
	private int size = 51;
	private int elementCount =0;
	private int counter = 10;
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
	public void addStudent2(Student student) {
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
			if(elementCount == counter) {
				System.out.println();
				System.out.println("The student number achieve "+counter);
				System.out.println();
				for(int j = 1;j<elementCount+1;j++) {
					System.out.println("Family Name: "+this.studentlist[j].getFname()+" Surname: "+this.studentlist[j].getLname()+" Program: "+this.studentlist[j].getProgram()+" Uni year: "+this.studentlist[j].getUniyear()+" Student id: "+this.studentlist[j].getId());
				}
				counter = counter+10;
			}
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
