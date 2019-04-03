package model;

import java.util.Comparator;

public class StudentGradeComparator implements Comparator<Student>{
	

	@Override
	public int compare(Student student1, Student student2) {
		int comparation;
		
		String grade1 = student1.getGrade()+"";
		String grade2 = student2.getGrade()+"";
		
		if(grade1.compareTo(grade2)<0) {
			comparation = -1;
		} else if(grade1.compareTo(grade2)>0) {
			comparation = 1;
		} else {
			comparation = 0;
		}
		return comparation;
	}
}
