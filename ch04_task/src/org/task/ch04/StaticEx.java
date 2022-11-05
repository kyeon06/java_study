package org.task.ch04;

import java.util.Arrays;

class ArrayUtil {
	public static int [] concat(int[] a, int[] b) {
		int totalSize = a.length + b.length;
		int[] totalArr = new int[totalSize];
		
		for ( int i = 0 ; i<a.length; i++) {
			totalArr[i] = a[i];
		}
		
		for ( int i = a.length; i<totalSize ; i++) {
			totalArr[i] = b[i - a.length];
		}
		
		return totalArr;
	}
	
	public static void print(int[] a) {
		System.out.println(Arrays.toString(a));
	}
}

public class StaticEx {
	public static void main(String[] args) {
		int [] array1 = {1, 5, 7, 9};
		int [] array2 = {3, 6, -1, 100, 77};
		int [] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
	}
}
