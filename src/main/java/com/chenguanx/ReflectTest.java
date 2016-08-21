package com.chenguanx;

import java.lang.reflect.Field;

public class ReflectTest {
	private String str = "a";
	
	public String getStr(){
		return str;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReflectTest g = new ReflectTest();
		System.out.println(g.str);
		
		 Field field;
		try {
			field = g.getClass().getDeclaredField("str");
			field.setAccessible(true);
		    field.set(g, "b");
		    System.out.println(g.str);
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		    
	}
}
