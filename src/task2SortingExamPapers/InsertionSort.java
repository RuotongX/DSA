package task2SortingExamPapers;
/**
 * This class is used to implement the insertion sort. The details about insertion sort I shown in the word file.
 * @author RuotongXu
 *
 */
public class InsertionSort {
	StudentListSort studentlist;

	public InsertionSort(StudentListSort sls) {
		studentlist = new StudentListSort();
		for (int j = 1; j < sls.getStudentList().length; j++) {
			studentlist.getStudentList()[j] = sls.getStudentList()[j];
		}
		for(int i = 1;i<studentlist.getStudentList().length;i++) {
			int pick = studentlist.getStudentList()[i].getId();
			int k =i;
			while(k>1 && studentlist.getStudentList()[k-1].getId()>pick) {
				studentlist.getStudentList()[k].setId(studentlist.getStudentList()[k-1].getId()); 
				k--;
			}
			studentlist.getStudentList()[k].setId(pick);
		}
		for (int j = 1; j < studentlist.getStudentList().length; j++)
			System.out.println("Family Name: " + this.studentlist.getStudentList()[j].getFname() + " Surname: "
					+ this.studentlist.getStudentList()[j].getLname() + " Program: "
					+ this.studentlist.getStudentList()[j].getProgram() + " Uni year: "
					+ this.studentlist.getStudentList()[j].getUniyear() + " Student id: "
					+ this.studentlist.getStudentList()[j].getId());
	}
}
