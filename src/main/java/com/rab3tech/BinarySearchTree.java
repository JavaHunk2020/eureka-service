package com.rab3tech;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
	
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		list.add(12);
		list.add(2);
		list.add(3);
		list.add(12);
		list.add(12);
		
	}
	
	static int binarySearchTree(int[] arr, int target) {
		 int low= 0;
		 int high=arr.length;
		 int count=0;
		 while(low<=high) {
			 int mid = low+(high-low)/2;
			 if(arr[mid]<=target) {
				 count=mid+1;
				 low=mid+1;
			 }else {
				 high =mid-1;
			 }
		 }
		return count;
	}

}
