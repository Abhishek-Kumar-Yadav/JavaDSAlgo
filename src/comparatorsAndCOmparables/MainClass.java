package comparatorsAndCOmparables;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		
		List<Student> students =new ArrayList<>();
		
		students.add(new Student(23,"Ram"));
		students.add(new Student(24,"Ramesh"));
		students.add(new Student(25,"Suresh"));
		students.add(new Student(27,"Nhyam"));
		students.add(new Student(27,"Mohan"));
		
		Collections.sort(students);
		
		students.forEach(System.out::println);

	}
	
}

class SortByNameThenMarks implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		if(o1.name.equals(o2.name)) {
			return o1.marks-o2.marks;
		}
		else {
			return o1.name.compareTo(o2.name);
		}
	}
	
}
