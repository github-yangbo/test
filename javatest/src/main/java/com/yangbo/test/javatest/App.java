package com.yangbo.test.javatest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
    	test1();
    }
    
    public static void test1() {
    	Random r = new Random();
    	
//    	boolean nextBoolean = r.nextBoolean();
//    	if(nextBoolean) {
//    		System.out.println("离职");
//    	}else {
//    		System.out.println("不离职");
//    	}
    	

    	Date d = new Date();
    	SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	String format = f.format(d);
    	System.out.println(format);
    	
    	int nextInt = r.nextInt(100);
    	if(nextInt < 50) {
    		System.out.println("离职");
    	}else {
    		System.out.println("不离职");
    	}
    }
}
