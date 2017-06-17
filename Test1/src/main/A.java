package main;

public class A {
public void ma() throws ArithmeticException, ClassNotFoundException{
	if(true){
		throw new ClassNotFoundException();
	}
	if(true){
		throw new ArithmeticException();
	}
}
}
