package main;

import java.util.HashMap;

public class A {
public void ma() throws ArithmeticException, ClassNotFoundException{
	if(true){
		throw new ClassNotFoundException();
	}
	if(true){
		throw new ArithmeticException();
	}
}
public static void main(String[] args) {
	HashMap hm =new HashMap();
	hm.put(new Integer(1), 7);
	hm.put(new Integer(2), 8);
	hm.put(new Integer(1), 9);
	System.out.println(hm.get(1));
	System.out.println(hm.size());
	
	Boolean b1=new Boolean(true);
	Boolean b2=new Boolean(true);
	boolean b3=true;
	Boolean b4=true;
	System.out.println(b1==b2);
	System.out.println(b1==b3);
	System.out.println(b1==b4);
	System.out.println(b3==b4);
	
	    
	        Runtime rt = Runtime.getRuntime();
	        long totalMem = rt.totalMemory();
	        long maxMem = rt.maxMemory();
	        long freeMem = rt.freeMemory();
	        double megs = 1048576.0;

	        System.out.println ("Total Memory: " + totalMem + " (" + (totalMem/megs) + " MiB)");
	        System.out.println ("Max Memory:   " + maxMem + " (" + (maxMem/megs) + " MiB)");
	        System.out.println ("Free Memory:  " + freeMem + " (" + (freeMem/megs) + " MiB)");
	    
	
	
	
}
}
