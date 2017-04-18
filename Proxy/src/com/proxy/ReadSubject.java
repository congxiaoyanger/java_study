package com.proxy;

public class ReadSubject implements Subject {

	public ReadSubject() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void rent() {
		// TODO Auto-generated method stub
		System.out.println("ReadSubject >>>>>  rent");

	}

	@Override
	public void hello(String str) {
		// TODO Auto-generated method stub
		System.out.println("ReadSubject >>>>>  hello" + str);

	}

}
