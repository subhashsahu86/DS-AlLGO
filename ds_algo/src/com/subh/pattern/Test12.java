package com.subh.pattern;

import java.util.Scanner;

/*

*********
****_****
***___***
**_____**
*_______*

 */

public class Test12 {
	
	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
			System.out.print("Enter the Number : ");
			int n =scn.nextInt();
			printPattern(n);
			scn.close();
			
	}
	
	private static void printPattern(int n) {
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=2*n-1;j++) {
				
				if(j<=(n+1-i) || j>=(n-1+i)) {
			
				System.out.print("*");
				}
				else {
					System.out.print("_");
				}
			}
			System.out.println();
		}
	}

}
