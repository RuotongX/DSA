package task2SortingExamPapers;

import java.util.Scanner;

public class SortingSystem {
	public static void main(String[] args) {
		StudentListSort sls = new StudentListSort();
		Scanner sc = new Scanner(System.in);
		Studentlist(sls);
		System.out.println("Please switch your case: (1 or 2)");
		System.out.println(
				"Case 1 will show all the students first, finally use the merge sort to sort to sort the student id.");
		System.out.println(
				"Case 2 will show once when add 10 more students, finally use the insertion to sort the student id.");
		try {
			int order = sc.nextInt();
			switch (order) {
			case 1:
				for (int i = 1; i < sls.getStudentList().length; i++) {
					System.out.println("Family Name: " + sls.getStudentList()[i].getFname() + " Surname: "
							+ sls.getStudentList()[i].getLname() + " Program: " + sls.getStudentList()[i].getProgram()
							+ " Uni year: " + sls.getStudentList()[i].getUniyear() + " Student id: "
							+ sls.getStudentList()[i].getId());
				}
				System.out.println("Push enter to display the merge sort");
				sc.nextLine();
				MergeSort ms = new MergeSort(sls);
				break;
			case 2:
				break;
			}
		} catch (Exception e) {
			System.out.println("Invalid input");
			System.err.println(e);
		}
	}

	private static void Studentlist(StudentListSort sls) {
		Student student1 = new Student("Tom", "Bic", "Math");
		Student student2 = new Student("Ttyrw", "Bhnrt", "English");
		Student student3 = new Student("Whngm", "Wigc", "Programming");
		Student student4 = new Student("Omg", "Edg", "Art");
		Student student5 = new Student("Ugergh", "Qighe", "Construction");
		Student student6 = new Student("Ioghn", "Ipiibr", "Japanese");
		Student student7 = new Student("Sam", "Free", "Chinese");
		Student student8 = new Student("Smoke", "Avicii", "Russian");
		Student student9 = new Student("Rude", "Green", "Spanish");
		Student student10 = new Student("Tehes", "Vtjrt", "Geography");
		Student student11 = new Student("Avdsg", "Ckyuk", "English");
		Student student12 = new Student("Eawd", "Thrh", "Programming");
		Student student13 = new Student("Arhjtj", "Vdsdw", "Art");
		Student student14 = new Student("Hawr", "Jekke", "Construction");
		Student student15 = new Student("Ilphkirf", "Pqwegws", "Japanese");
		Student student16 = new Student("Myjkt", "Lrabrg", "Chinese");
		Student student17 = new Student("Sawerg", "Iegeee", "Russian");
		Student student18 = new Student("Edfgs", "Awhg", "Spanish");
		Student student19 = new Student("Bhrewas", "Wveds", "Geography");
		Student student20 = new Student("Harg", "Naherhe", "Math");
		Student student21 = new Student("Tege", "Bqwef", "Programming");
		Student student22 = new Student("Tvefr", "Bqwer", "Art");
		Student student23 = new Student("Wceswem", "Wihf", "Construction");
		Student student24 = new Student("Oqwe", "Ergt", "Japanese");
		Student student25 = new Student("Ujyj", "Qvasd", "Chinese");
		Student student26 = new Student("Iewan", "Ivrasr", "Russian");
		Student student27 = new Student("Srrwm", "Fvserg", "Spanish");
		Student student28 = new Student("Stre", "Aase", "Geography");
		Student student29 = new Student("Rve", "Geewqn", "Math");
		Student student30 = new Student("Hat", "Name", "English");
		Student student31 = new Student("Tm", "Bic", "Art");
		Student student32 = new Student("Ttyrw", "Bnrt", "Construction");
		Student student33 = new Student("Whrngm", "Wigc", "Japanese");
		Student student34 = new Student("Om", "Edg", "Chinese");
		Student student35 = new Student("Ugergh", "Qghe", "Russian");
		Student student36 = new Student("Ighn", "Ipiibr", "Spanish");
		Student student37 = new Student("Sam", "Fretge", "Geography");
		Student student38 = new Student("Smoke", "Aviii", "Math");
		Student student39 = new Student("Rude", "Geten", "English");
		Student student40 = new Student("Hate", "Nme", "Programming");
		Student student41 = new Student("Tom", "Bighrc", "Construction");
		Student student42 = new Student("Ttyrw", "Bhnerewrt", "Japanese");
		Student student43 = new Student("Whnggem", "Wigegc", "Chinese");
		Student student44 = new Student("Omawegewag", "Edgergg", "Russian");
		Student student45 = new Student("Ugerfsegh", "Qighefase", "Spanish");
		Student student46 = new Student("Ioghgen", "Ipieggibr", "Geography");
		Student student47 = new Student("Swerfam", "Fregeee", "Math");
		Student student48 = new Student("Smoagvke", "Avicvfseii", "English");
		Student student49 = new Student("Ruaefde", "Greafeen", "Programming");
		Student student50 = new Student("Hataefe", "Naaefme", "Art");
		sls.addStudent(student1);
		sls.addStudent(student2);
		sls.addStudent(student3);
		sls.addStudent(student4);
		sls.addStudent(student5);
		sls.addStudent(student6);
		sls.addStudent(student7);
		sls.addStudent(student8);
		sls.addStudent(student9);
		sls.addStudent(student10);
		sls.addStudent(student11);
		sls.addStudent(student12);
		sls.addStudent(student13);
		sls.addStudent(student14);
		sls.addStudent(student15);
		sls.addStudent(student16);
		sls.addStudent(student17);
		sls.addStudent(student18);
		sls.addStudent(student19);
		sls.addStudent(student20);
		sls.addStudent(student21);
		sls.addStudent(student22);
		sls.addStudent(student23);
		sls.addStudent(student24);
		sls.addStudent(student25);
		sls.addStudent(student26);
		sls.addStudent(student27);
		sls.addStudent(student28);
		sls.addStudent(student29);
		sls.addStudent(student30);
		sls.addStudent(student31);
		sls.addStudent(student32);
		sls.addStudent(student33);
		sls.addStudent(student34);
		sls.addStudent(student35);
		sls.addStudent(student36);
		sls.addStudent(student37);
		sls.addStudent(student38);
		sls.addStudent(student39);
		sls.addStudent(student40);
		sls.addStudent(student41);
		sls.addStudent(student42);
		sls.addStudent(student43);
		sls.addStudent(student44);
		sls.addStudent(student45);
		sls.addStudent(student46);
		sls.addStudent(student47);
		sls.addStudent(student48);
		sls.addStudent(student49);
		sls.addStudent(student50);
	}
}
