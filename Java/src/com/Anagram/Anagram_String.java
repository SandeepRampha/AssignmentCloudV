package com.Anagram;

import java.util.Arrays;

public class Anagram_String {

	public static void main(String[] args) {
		
		String input1 = "listen";
		String input2 = "Silent";
		
		System.out.println(Anagram_String.show(input1, input2));
		
		String str1 = "Hello";
		String str2 = "World";
		
		System.out.println(Anagram_String.show(str1, str2));
	}
	
	public static boolean show(String input1, String input2) {
		boolean isAnangram = false;
		if(input1.length() == input2.length()) {
			char arr1[] = input1.toLowerCase().toCharArray();
			char arr2[] = input2.toLowerCase().toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			char[] arr = arr1.length>arr2.length?arr1:arr2;
			for(int i=0;i<arr.length;i++) {
				if(arr1[i] == arr2[i])
					isAnangram = true;
				else
					isAnangram = false;
			}

//(Alternative)		isAnangram = Arrays.equals(arr1, arr2); 

		}
		else
			isAnangram = false;
		
		return isAnangram;
	}

}
