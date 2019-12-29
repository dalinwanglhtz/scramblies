package com.codewardev;

import java.util.Arrays;

// https://www.codewars.com/kata/scramblies/train/java

public class Scramblies {

	public static boolean scramble(String str1, String str2) {
		int[] str1Array = new int[Arrays.stream(str1.split("")).mapToInt(x->x.toCharArray()[0]).max().getAsInt()+1];
		Arrays.fill(str1Array, 0);
		System.out.println("size of str1Array: "+str1Array.length);
		
		char[] str1ArrayContent = str1.toCharArray();
		for(int i=0; i<str1ArrayContent.length; i++) {
			str1Array[str1ArrayContent[i]]++;
		}
		
		printArray(str1Array);
		
		int[] str2Array = new int[Arrays.stream(str2.split("")).mapToInt(x->x.toCharArray()[0]).max().getAsInt()+1];
		Arrays.fill(str2Array, 0);
		System.out.println("size of str2Array: "+str2Array.length);
		
		char[] str2ArrayContent = str2.toCharArray();
		for(int i=0; i<str2ArrayContent.length; i++) {
			str2Array[str2ArrayContent[i]]++;
		}
		
		printArray(str2Array);
		
		for(int i=0; i<str2Array.length; i++) {
			if(str2Array[i] > str1Array[i]) {
				return false;
			}
		}
		
		return true;
	}

	private static void printArray(int[] str1Array) {
		for(int i=0; i<str1Array.length; i++) {
			if(str1Array[i] != 0) {
				System.out.println("char: "+(char) i+" occuring "+str1Array[i]);
			}
		}
		
	}

}
