package com.org.problems;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;

public class SumOfStringInteger {

	public static void main(String[] args) {
		long ar[]= {1001458909L, 1004570889L, 1007019111L, 1003302837L, 1002514638L, 1006431461L, 1002575010L, 1007514041L, 1007548981L, 1004402249L};
		System.out.println(aVeryBigSum(ar));
	}
	  static long aVeryBigSum(long[] ar) {
	        String a="";
	        String b="";
	        String sum="";
	        int carry=0;
	        for(int i=0;i<ar.length;i++){
	        	a=""+ar[i];
	        	b=sum;
	        	sum="";
	            int j=a.length()-1;
	            int k=b.length()-1;
	            while(j>=0 && k>=0){
	                int val=intVal(a.charAt(j))+intVal(b.charAt(k))+carry;
	                if(val>9) {
	                	sum=(val%10)+sum;
	                	carry=val/10;
	                }else {
	                	sum=val+sum;
	                	carry=val/10;
	                }
	                j--;
	                k--;
	            }
	            while(j>=0) {
	            	sum=a.charAt(j)+sum;
	            	j--;
	            }
	            while(k>=0) {
	            	sum=a.charAt(k)+sum;
	            	k--;
	            }
	            if(carry>0) {
	            	sum=carry+sum;
	            }
	            
	        }
	        return Long.parseLong(sum);
	    }
	  static int intVal(char a) {
		  return (int)a-'0';
	  }
}
