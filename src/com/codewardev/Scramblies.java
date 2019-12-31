package com.codewardev;

import java.util.Arrays;

// https://www.codewars.com/kata/scramblies/train/java

public class Scramblies {

	public static boolean scramble(String str1, String str2) {	
		int[] str1Array = getStrArray(str1);
		int[] str2Array = getStrArray(str2);
		
		for(int i=0; i<str2Array.length; i++) {
			if(str2Array[i] > str1Array[i]) {
				return false;
			}
		}
		
		return true;
	}

	private static int[] getStrArray(String str) {
		int[] array = new int[Arrays.stream(str.split("")).mapToInt(x->x.toCharArray()[0]).max().getAsInt()+1];
		Arrays.fill(array, 0);
		
		fillStrArray(array, str);
		
		return array;
	}

	private static void fillStrArray(int[] array, String str) {
		char[] strArrayContent = str.toCharArray();
		for(int i=0; i<strArrayContent.length; i++) {
			array[strArrayContent[i]]++;
		}
	}

}
