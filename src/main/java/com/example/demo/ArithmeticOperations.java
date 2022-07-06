package com.example.demo;


import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class ArithmeticOperations {

	public static void main(String[] args) {
	
		System.out.println("Arithmetic Operations");
		int a;
		int b;
		int c;
		a=10;
		b=5;
		c=a+b;
		System.out.println("Sum :"+c);
		
		c=a-b;
		System.out.println("Sub :"+c);
		
		c=a*b;
		System.out.println("Mul :"+c);
		
		c=a/b;
		System.out.println("Div :"+c);
		
	}

}
