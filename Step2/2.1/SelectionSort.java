package com.himanshu.example;

public class SelectionSort {

	public static void main(String args[]) {
		
		System.out.println("hola");
		
		int arr[] = {12,29,25,8,32,17,40};
		
		int len = arr.length;
		
		for(int i =0; i<len; ++i) {
			
			for(int j =i+1; j< len; ++j) {
				
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			for(int ii = 0; ii<len; ++ii) {
				System.out.print(arr[ii]+" ");
			}
			System.out.println();
		}
		
		for(int i = 0; i<len; ++i) {
			System.out.print(arr[i]+" ");
		}
	}
}
