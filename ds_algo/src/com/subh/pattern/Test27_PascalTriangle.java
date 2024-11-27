package com.subh.pattern;

import java.util.Scanner;

public class Test27_PascalTriangle {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = scn.nextInt();
		printPattern(n);
		scn.close();
	}
	
	private static void printPattern(int n) {
		
		for(int i=1; i<=n; i++) {
			int k=1;
			boolean flag=true;
			for(int j=1; j<=2*n-1; j++) {
				if(j>=n+1-i && j<=n-1+i) {
					if(flag==true) {
					System.out.print(i);
					flag=false;
					}else {
						System.out.print(" ");
						flag=true;
					}
						
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
