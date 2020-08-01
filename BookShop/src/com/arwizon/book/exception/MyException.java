package com.arwizon.book.exception;

public class MyException extends Exception {
		
		
		String detailMsg;
		
		public MyException(String msg) {
			this.detailMsg = msg;
		}
		@Override
		public String getMessage() {
			return detailMsg;
		}
	}



