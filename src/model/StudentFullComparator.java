package model;

import java.util.Comparator;

public class StudentFullComparator implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		int comparator;
		String name1 = student1.getName();
		String name2 = student2.getName();
		String lname1 = student1.getLastname();
		String lname2 = student1.getLastname();
		
		if(lname1.compareTo(lname2)<0) {
			comparator = -1;
		} else if(lname1.compareTo(lname2)>0) {
			comparator = 1;
		} else {
			if(name1.compareTo(name2)<0) {
				comparator = -1;
			} else if(name1.compareTo(name2)>0) {
				comparator = 1;
			} else {
				comparator = 0;
			}
		}
		
		return comparator;
	}
	
	

}
