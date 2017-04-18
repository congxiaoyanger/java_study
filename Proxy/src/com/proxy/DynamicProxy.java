package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {

	private Object subject;
	
	public DynamicProxy(Object obj) {
		// TODO Auto-generated constructor stub
		
		this.subject = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
        System.out.println("before rent house");
        System.out.println("Method:" + method);
        
        if (null != args) {

            System.out.println("Method:" + args.length);
        }

		method.invoke(subject, args);
		
		System.out.println("after rent house");
		return null;
	}

}
