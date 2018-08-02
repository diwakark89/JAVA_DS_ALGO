package com.org.excercise;

import java.util.ArrayList;

@FunctionalInterface
interface Square
{
    void calculate(int x);
}

interface FuncInter1{
	int operation(int a,int b);
}

interface FuncInter2
{
    void sayMessage(String message);
}



public class FunctionalInterfaceAndLambda {
	private int operate(int a,int b, FuncInter1 fobj){
		 return fobj.operation(a, b);
	}
	public static void main(String[] args) {
//		listExample();	
		functionOperation();
//		simpleExample();
	
	}
	static void functionOperation() {
		FuncInter1 add=(int x,int y)->(x+y);
		FuncInter1 mul=(int x,int y)->(x*y);
		FunctionalInterfaceAndLambda fl=new FunctionalInterfaceAndLambda();
		System.out.println("Add: "+fl.operate(5, 6, add));
		System.out.println("Mul: "+fl.operate(5, 6, mul));
		
		FuncInter2 greet= message->System.out.println("Hello "+message);
		greet.sayMessage("geek");
		
	}
	static void simpleExample() {
		int a=5;
		Square s=(int x)->System.out.println(x*x);
		s.calculate(a);
	}
	
	public static void listExample() {
		ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);
 
        // Using lambda expression to print all elements
        // of arrL
        arrL.forEach(n -> System.out.print(" "+n));
        System.out.println();
        // Using lambda expression to print even elements
        // of arrL
        arrL.forEach(n -> { if (n%2 == 0) System.out.print(" "+n); });
	}

}

