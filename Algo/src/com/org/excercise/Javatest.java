package com.org.excercise;

import java.util.concurrent.ConcurrentHashMap;

public class Javatest {
	public static void main(String []args) {
		System.out.println("Hello");
		ConcurrentHashMap<String, Stock> dataMap=new ConcurrentHashMap<String, Stock>();
		String key="1";
		double val=10;
		Stock stock=null;
		if(dataMap.containsKey(key)==true) {
			stock=dataMap.get(key);
			double total=stock.avg*stock.count;
			stock.count++;
			stock.avg=(total+val)/stock.count;
		}
		else {
			stock=new Stock(1, val);
		}
		dataMap.put(key, stock);
	}
	
}
class Stock{
	int count;
	double avg;
	public Stock(int count,double avg) {
		this.count=count;
		this.avg=avg;
	}
}
