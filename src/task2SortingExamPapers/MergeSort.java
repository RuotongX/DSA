package task2SortingExamPapers;

public class MergeSort {
	private Student[] templist;
	private int low = 1;
	private int high = 0;
	private Student[] studentlist;
	public MergeSort(StudentListSort studentlist) {
		this.high = studentlist.getStudentList().length;
		this.templist = new Student[high];
		this.studentlist = new Student[high];
		for(int i = 1;i<high;i++) {
			this.studentlist[i] = studentlist.getStudentList()[i];
		}
		Mergesort(low,high-1);
		System.out.println("Merge sort result: ");
		for(int j = 1;j<this.studentlist.length;j++) {
			System.out.println("Family Name: "+this.studentlist[j].getFname()+" Surname: "+this.studentlist[j].getLname()+" Program: "+this.studentlist[j].getProgram()+" Uni year: "+this.studentlist[j].getUniyear()+" Student id: "+this.studentlist[j].getId());
			
		}
	}
	private void Mergesort(int low,int high) {
		if(low<high) {
		    int middle = low+(high-low)/2;
		    Mergesort(low,middle);
		    Mergesort(middle+1,high);
		    Merge(low,middle,high);
	    }
	}
	private void Merge(int low,int middle,int high) {
		for(int i = low;i<=high;i++) 
			templist[i] = studentlist[i];
		
		int i = low;
		int j = middle +1;
		int k = low;
		while(i<=middle && j<=high) {
			if(templist[i].getId()<=templist[j].getId()) {
				studentlist[k] = templist[i];
				i++;
			}
			else {
				studentlist[k] = templist[j];
				j++;
			}
			k++;
		}
		while(i<=middle) {
			studentlist[k] = templist[i];
			i++;
			k++;
		}
	}
}
