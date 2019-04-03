package model;

import java.util.Arrays;
import java.util.Comparator;

import model.StudentNameComparator;

public class Course {
	
	private Student[] students;
	
	public Course(Student[] sts) {
		students = sts;
	}

	public Student[] getStudents() {
		return students;
	}
	
	public void sortByLastName() {
		for (int I = 0; I < students.length-1; I++) {
			String minLastName = students[I].getLastname();
			int minPosition = I;
				for (int J = I+1; J < students.length; J++) {
					String currentLastName = students[J].getLastname();
					if(currentLastName.compareTo(minLastName) < 0) {
				
					}
				}
			Student temp = students[minPosition];
			students[minPosition] = students[I];
			students[I] = temp;
		}
	}
	
	public void sortByCode() {
		Arrays.sort(students);
	}
	
	public void sortByName() {
		Comparator<Student> studentComparator = new StudentNameComparator();
		
		Arrays.sort(students, studentComparator);
	}
	//Collections.sort en el caso que fuera un List
	public void sortByGrade() {
		Comparator<Student> studentComparator = new StudentGradeComparator();
		
		Arrays.sort(students, studentComparator);
	}
	
	public void sortByFullName() {
		Comparator<Student> studentComparator = new StudentFullComparator();
		
		Arrays.sort(students, studentComparator);
	}
}

