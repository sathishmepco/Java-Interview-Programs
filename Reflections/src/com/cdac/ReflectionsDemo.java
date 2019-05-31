package com.cdac;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionsDemo {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException,
			IllegalArgumentException, IllegalAccessException, InvocationTargetException {

		Class c = String.class;
		Method[] methods = c.getMethods();

		System.out.println("Methods in String class :: ");
		for (Method m : methods)
			System.out.println(m.getName());

		Account account = new Account(5000);
		Class accountClass = Class.forName("com.cdac.reflection.Account");
		methods = accountClass.getMethods();
		System.out.println("Methods in Account class");
		for (Method m : methods) {
			System.out.println(m.getName());
			if (m.getName().contains("set")) {
				m.invoke(account, 30000);
			}
		}
		System.out.println("Account Balance :: " + account.getBalance());

		// when field is public
		/*
		 * Field f = accountClass.getField("balance"); f.setInt(account, 10000);
		 * System.out.println(account.getBalance());
		 */

		// accessing the private fields
		Field privateField = accountClass.getDeclaredField("balance");
		privateField.setAccessible(true);
		privateField.set(account, 20000);
		System.out.println("New Balance is :: " + account.getBalance());

		Field[] fields = accountClass.getDeclaredFields();
		System.out.println("Fields in Account class");
		for (Field field : fields)
			System.out.println(field.getName());
	}

}