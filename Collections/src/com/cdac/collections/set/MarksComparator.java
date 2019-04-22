package com.cdac.collections.set;

import java.util.Comparator;
import com.cdac.collections.bean.Student;

public class MarksComparator implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getMarks() > o2.getMarks())
			return 1;
		else if(o1.getMarks() < o2.getMarks())
			return -1;
		return 0;
	}
}
