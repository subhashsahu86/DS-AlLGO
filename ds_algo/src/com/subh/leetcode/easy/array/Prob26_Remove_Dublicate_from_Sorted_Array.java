package com.subh.leetcode.easy.array;

import java.util.Arrays;

public class Prob26_Remove_Dublicate_from_Sorted_Array {
	
	public static void main(String[] args) {
		
		int [] ia = {1,1,2};
		System.out.println(removeElements(ia));
		
		
	}
	
	private static int removeElements(int [] nums) {
		
		
		System.out.println(Arrays.toString(nums));
		int i=0,j=1;
		
		while(j<nums.length) {
			if(nums[i]!=nums[j]) { //got the unique element
				i++;
				nums[i]=nums[j];
			}
			j++;
		}
		return i+1;
	
		
	
		
	
	}

}


