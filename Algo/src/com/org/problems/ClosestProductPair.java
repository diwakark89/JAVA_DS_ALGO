package com.org.problems;

import java.util.Arrays;
/*Given an array of non negative integers and a number x, find a pair in array whose product is closest to x.
Examples:
Input : arr[] = [2, 3, 5, 9]
       x = 47
Output : {5, 9}
Input : arr[] = [2, 3, 5, 9]
        x = 8
Output : {2, 5}
*/
public class ClosestProductPair {

	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
		int array[]= {2, 3, 5, 9,1,4};
		closestPair(array,18);
		
	}
	private static void closestPair(int arr[],int x) {
		Arrays.sort(arr);
		int rs,ls,r,l,diff;
		r=0;
		l=arr.length-1;
		rs=arr[r];
		ls=arr[l];
		diff=x;
		while(r<l) {
			int val=Math.abs(arr[r]*arr[l]-x);
			if(val<diff) {
				diff=val;
				rs=arr[r];
				ls=arr[l];
				r++;
			}else {
				l--;
			}
		}
		System.out.println(rs+" "+ls);
	}

}
