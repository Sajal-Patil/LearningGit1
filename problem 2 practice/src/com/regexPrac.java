package com;

import java.util.regex.Pattern;

public class regexPrac {

	public static void main(String[] args) {
		String regex = "[\\d]{1,},[\\d]{1,}@[\\d]{1,},[\\d]{1,}@[\\d]{1,},[\\d]{1,}";
		String regex1 = "[A-Za-z]{1,}.[A-Za-z-!@#$%^&*')( ]{1,}";
		// TODO Auto-generated method stub
		boolean bool = Pattern.matches(regex, "250,10@100,3@50,7");
		boolean bool1 = Pattern.matches(regex1, "Daniel D'Cr-uz");
		System.out.println(bool1);
	}

}
