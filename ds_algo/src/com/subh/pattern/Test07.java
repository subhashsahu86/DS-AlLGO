package com.subh.pattern;

import java.util.Scanner;

/*
    *
   **
  ***
 ****
*****

 */

public class Test07 {
	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
			System.out.print("Enter the Number : ");
			int n =scn.nextInt();
			printPattern(n);
			scn.close();
	}
	
	private static void printPattern(int n ) {
		
		for(int i=1;i<=n;i++) {  //for rows
			
			for(int j=1;j<=n;j++) { //for coloum
				if(j>=(n+1)-i){
					System.out.print("*");
				}else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
