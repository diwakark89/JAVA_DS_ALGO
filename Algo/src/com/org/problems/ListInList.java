package com.org.problems;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListInList extends Thread implements Runnable{
	public static void main(String []arsg) {
	List l=new ArrayList();
	ListInList l1=new ListInList();
	ListInList l2=new ListInList();
	l.add(l1);
	l.add(l2);
	Collections.sort(l);
	for(int i=0;i<l.size();i++) {
		System.out.println(l.get(i));
	}
	
	}
	
}
