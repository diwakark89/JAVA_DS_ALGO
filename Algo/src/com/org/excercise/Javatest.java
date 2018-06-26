package com.org.excercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Javatest {
	public static void main(String []args) {
//		int a[]= {140638725, 436257910, 953274816, 734065819, 362748590};
//		System.out.println(solve("12:00:00AM"));
//		System.out.println(solve("12:01:00AM"));
//		System.out.println(solve("12:01:00PM"));
//		System.out.println(solve("12:01:00AM"));
//		System.out.println(solve("01:01:00PM"));
//		System.out.println(solve("01:01:00AM"));
//		System.out.println(solve("06:01:00AM"));
//		System.out.println(solve("06:01:00PM"));
//		System.out.println(solve("02:00:00AM"));
//		System.out.println(solve("02:01:00PM"));
		System.out.println(solve("03:00:00AM"));
		System.out.println(solve("03:01:00PM"));
		System.out.println(solve("04:00:00AM"));
		System.out.println(solve("04:01:00PM"));
		System.out.println(solve("12:45:54PM"));
		List<String> lis=Arrays.asList("1","2","3","4");
		List<String> lis1=Arrays.asList("12","22","32","42");
		System.out.println(lis);
		change(lis,lis1);
		System.out.println(lis);
	}
	static void change(List<String> lis,List<String> lis1) {
		lis=lis1;
	}
	 static int solve(int[] ar) {
		return 0;
		 
	 }
	 static String solve(String str) {
		 int a=Integer.parseInt(str.substring(0, 2));
		 String s=str.substring(str.length()-2);
		 if("PM".equalsIgnoreCase(s)) {
			 if(a<12) {
				 a=a+12;
			 }
//			 if(a==12) {
//				 a=a+1;
//			 }
			 return a+(str.substring(2, str.length()-2));
		 }else {
			 if(a==12) {
				 return"00"+str.substring(2, str.length()-2);
			 }
			 return str.substring(0, str.length()-2);
		 }
	 }
		
}
