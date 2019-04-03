package ui;

import model.Course;
import model.Student;

public class Main {

	public static void main(String[] args) {
		Course course = new Course(
				new Student[] {
						new Student("Juan", "Reyes", "A0123", 1.3),
						new Student("Ana", "Muñoz", "A0683", 5.0),
						new Student("Jairo", "Rodríguez", "A0178", 4.5),
						new Student("Alejandro", "Martínez", "A0416", 3.8),
						new Student("David", "Lectamo", "A0541", 4.2),
				}
		); 
			
			Student[] sts1 = course.getStudents();
			System.out.println("=====\n At the begin");
			printStudents(sts1);
			
			course.sortByLastName();
			System.out.println("=====\n Sorted by Lastname");
			Student[] sts2 = course.getStudents();
			printStudents(sts2);
			
			course.sortByCode();
			System.out.println("=====\n Sorted by code");
			Student[] sts3 = course.getStudents();
			printStudents(sts3);
			
			course.sortByName();
			System.out.println("=====\n Sorted by Name");
			Student[] sts4 = course.getStudents();
			printStudents(sts4);
			

			course.sortByGrade();
			System.out.println("=====\n Sorted by Grade");
			Student[] sts5 = course.getStudents();
			printStudents(sts5);
			
			course.sortByFullName();
			System.out.println("=====\n Sorted by Full name");
			Student[] sts6 = course.getStudents();
			printStudents(sts6);
		}

	
	public static void printStudents(Student[] array) {
		for (int I = 0; I < array.length; I++) {
			System.out.println(array[I].getName()+ "\t"+
					array[I].getLastname() + "\t"+
					array[I].getCode() + "\t");
		}
	}

}
