package com.timeinc.practice.String;

import java.util.Arrays;

public class AnagramWithOutUsingInBuiltMethod {

	public static void main(String[] args) {

		//checkAnagramMethod1("Mother In Law", "Hitler Woman");
		checkAnagramMethod2("ASTRONOMERS", "NO MORE STARS");
	}

	public static boolean checkAnagramMethod1(String s1, String s2) {
		boolean status = true;
		String copyOfs1 = s1.replaceAll("\\s", "");
		String copyOfs2 = s2.replaceAll("\\s", "");

		if (copyOfs1.length() != copyOfs2.length()) {
			status = false;
		} else {
			char[] char1 = copyOfs1.toLowerCase().toCharArray();
			char[] char2 = copyOfs2.toLowerCase().toCharArray();

			Arrays.sort(char1);
			Arrays.sort(char2);

			status = Arrays.equals(char1, char2);
		}

		if (status) {
			System.out.println(s1 + " and " + s2 + " are anagrams");
		} else {
			System.out.println(s1 + " and " + s2 + " are not anagrams");
		}

		return status;

	}

	
	public static boolean checkAnagramMethod2(String s1,String s2)
	{
		
		boolean status=true;
		String copyOfs1 = s1.replaceAll("\\s", "");
		String copyOfs2 = s2.replaceAll("\\s", "");

		if (copyOfs1.length() != copyOfs2.length()) {
			status = false;
		}
		else
		{
			char[] s1ToArray = copyOfs1.toCharArray();
			
			for(char c:s1ToArray){
				int index=copyOfs2.indexOf(c);
				
				if(index!=-1)
				{
					copyOfs2 = copyOfs2.substring(0, index)+copyOfs2.substring(index+1, copyOfs2.length());
				}
				else
				{
					status = false;
					break;
				}
			}
		}
		
		if(status)
        {
            System.out.println(s1+" and "+s2+" are anagrams");
        }
        else
        {
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
		
		return status;
	}
}
