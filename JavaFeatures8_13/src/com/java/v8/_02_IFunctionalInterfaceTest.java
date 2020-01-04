package com.java.v8;

//Tek bir abstract(soyut) methodu bulunan interface’ler için kullanýlan tanýmdýr.
//Single Abstract Method Interfaces (SAM Interfaces)
public class _02_IFunctionalInterfaceTest {
	
	
	public static void main(String[] args) {
		
		_02_IFunctionalInterfaces addition = (x,y) -> x + y;
		_02_IFunctionalInterfaces multiplication = (x,y) -> x * y;
		System.out.println("3 + 5 = " + addition.apply(3,5));
		System.out.println("3 * 5 = " + multiplication.apply(3,5));
		
	}

}
