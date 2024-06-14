package com.stream.entities.main;
import java.util.Arrays;
import java.util.stream.Stream;

import com.streamapi.entities.Student;

public class MainStudent {
	public static void main(String args[]) {
		Student[] studentArray= new Student[5];
		studentArray[0]= new Student(1,"Vijay",34);
		studentArray[1] = new Student(2,"Anikat",43);
		studentArray[2] = new Student(3,"Ashish",22);
		studentArray[3] = new Student(4,"Taha",25);
		studentArray[4] = new Student(5,"Shon",22);
//		System.out.println(studenArray[1]);
		Stream<Student> studentStream = Arrays.stream(studentArray);
//		studentStream
//		.map(obj->obj.getName())
////		.map(Student::getName)
//		.filter(str->str.charAt(0)=='A')
////		.map(Student::getAge)
//		.distinct()
//		.filter(obj->bj.getAge()>20)
//		.filter(e->e.getName().chatAt(3)=='a')
////		.forEach(System.out::println);
////		.forEach(System.out::println);
//		.filter(e->e.getName().charAt(3)!='a')
//		.map(Student::getName)
//		.toArray(String[]:: new);
//		System.out.println(Arrays.toString(name));
//		
		
		String[] name=studentStream
		.filter(e->e.getName().charAt(3)!='a')
		.map(Student::getName)
		.toArray(String[]:: new);
		
		System.out.println(Arrays.toString(name));	
		
		studentStream.close();
		
		
	}
}
