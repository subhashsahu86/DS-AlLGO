package com.subh.leetcode.easy;

public class Prob09_isPalandromeNumber {
	
	/*
	 * public static boolean isPalandrome(int x) {
	 * 
	 * 
	 * }
	 */
	
	public static int i,j;
	
	public static void main(String[] args) {
		
	
		String s = "-121";
		 char[] ch =  s.toCharArray();
		 System.out.println(s.length());
		 for( i = 0; i<=s.length()-1;i++) {
		 System.out.println(ch[i]);
		 
		 } 
		 
		 System.out.println(ch);
		 
		 for ( j=s.length()-1;j>0;j--) {
			 char [] ch2 = new char[s.length()];
			 ch2[j] = ch[i];
			 System.out.println(ch2);
		 }
		 
		
	}

}
