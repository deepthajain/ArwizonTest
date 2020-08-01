package com.arwizon.book.utilities;

import com.arwizon.book.exception.MyException;

public class Utilities {
	
	public static void nameValidation(String name) throws MyException {
		String pattern = "[A-Za-z]+";
		if (!name.matches(pattern)) {
			throw new MyException("Name can only be alphabets");
		}
	}
		public static void copiesValidation(String number) throws MyException {
			String pattern = "[1-9]{1}[0-9]*";
			if (!number.matches(pattern)) {
				throw new MyException("Copies can only be numbers");
			}
		}
		
		public static void costValidation(String cost) throws MyException {
			String pattern = "[1-9]{1}[0-9]*(.)[0-9]*";
			if (!cost.matches(pattern)) {
				throw new MyException("Cost only be numbers");
			}
		}
		
	}

