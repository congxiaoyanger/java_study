package com.proxy;

import java.lang.reflect.Proxy;

public class Client {

	public Client() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Subject readSubject = new ReadSubject();
		DynamicProxy proxy = new DynamicProxy(readSubject);
		
		Subject sub = (Subject) Proxy.newProxyInstance(proxy.getClass().getClassLoader(), readSubject.getClass().getInterfaces(), proxy);
		
		sub.rent();
		
		sub.hello("this is test >>>>>>/n");
		
	}

}
