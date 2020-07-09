package com.yangbo.test.javatest;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorTest {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		while(true) {
			Object o = new Object();
			list.add(o);
		}
	}
	
}
