package main;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class MainClass {
 int a=9;
	public static void main(String[] args) {

		HashMap <Student, Integer> hm=new HashMap<>();
		hm.put(new Student(10,"Sunil"), 1);
		hm.put(new Student(20,"santosh"),2);
		hm.put(new Student(10,"Sunil"), 6);
		System.out.println(hm);
		
		HashSet<Student> hs=new HashSet<>();
		hs.add(new Student(1,"Sunil"));
		hs.add(new Student(2,"santosh"));
		hs.add(new Student(1,"Sunil"));
		System.out.println(hs);
		
		TreeSet<Student> ts=new TreeSet<>();
		ts.add(new Student(4,"santosh3"));
		ts.add(new Student(2,"santosh"));
		ts.add(new Student(1,"Sunil"));
		ts.add(new Student(3,"santosh2"));
		ts.add(new Student(1,"Sunil"));
		System.out.println(ts);
		
		
	//fsadfasfasdfasd

		// TODO Auto-generated method stub
System.out.println("hello");

System.out.println("second branch is created in name Brach2");


System.out.println("in new Bra");
		//aomw chds deedd



System.out.println();

	}


}
