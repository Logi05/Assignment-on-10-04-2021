package com.streamseg;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class PredictEg {
	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(new Student(105,"Priya",89f));
		list.add(new Student(101,"Gayu",67f));
		list.add(new Student(106,"Logi",45f));
		list.add(new Student(102,"Anu",53f));
		list.add(new Student(104,"Ram",33f));
		list.add(new Student(103,"Sankari",95f));
		
		Predicate<Student> p=a->a.stuMarks>80;
		Predicate<Student> p1=a->(a.stuMarks>=65) && (a.stuMarks<=80);
		Predicate<Student> p2=a->(a.stuMarks>50) && (a.stuMarks<65);
		Predicate<Student> p3=a->(a.stuMarks>=35) && (a.stuMarks<=50);
		Predicate<Student> p4=a->(a.stuMarks<35);
		
		/*List<Float> list1=list.stream()
				.filter(m -> m.stuMarks > 80f)
				.map(m -> m.stuMarks)
				.collect(Collectors.toList());
			System.out.println("Distinction Students List:");
			System.out.println("Student Mark"+list1);*/
			
			System.out.println("Marks above 80 are the Students who got Third Class:");
			list.stream()
				.filter(m -> m.stuMarks>80).forEach(m -> System.out.println("Student Name: "+m.stuName+" "+"Student Mark:"+m.stuMarks));
			System.out.println();
			
			System.out.println("Marks between 65 to 80 are the Students who got First Class:");
			list.stream()
				.filter(m -> (m.stuMarks>65) && (m.stuMarks<=80)).forEach(m -> System.out.println("Student Name: "+m.stuName+" "+"Student Mark:"+m.stuMarks));
			System.out.println();
			
			System.out.println("Marks between 50 to 65 are the Students who got Second Class:");
			list.stream()
				.filter(m -> (m.stuMarks>50) && (m.stuMarks<=60)).forEach(m -> System.out.println("Student Name: "+m.stuName+" "+"Student Mark:"+m.stuMarks));
			System.out.println();
			
			System.out.println("Marks between 35 to 50 are the Students who got Third Class:");
			list.stream()
				.filter(m -> (m.stuMarks>=35) && (m.stuMarks<=50)).forEach(m -> System.out.println("Student Name: "+m.stuName+" "+"Student Mark:"+m.stuMarks));
			System.out.println();
			
			System.out.println("Marks Below 35 are the Students who got Fail:");
			for(Student s:list)
			{
				if(p4.test(s))
				{
					System.out.println("Student Name:"+s.stuName+" "+"Student Mark:"+s.stuMarks);
				}
			}
						
	}
}
class Student
{
	int stuid;
	String stuName;
	float stuMarks;
	public Student(int stuid, String stuName, float stuMarks) {
		super();
		this.stuid = stuid;
		this.stuName = stuName;
		this.stuMarks = stuMarks;
	}
	
}