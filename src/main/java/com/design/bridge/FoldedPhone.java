package com.design.bridge;


//???????????? ?????? Phone
public class FoldedPhone extends Phone {

	//??????
	public FoldedPhone(Brand brand) {
		super(brand);
	}
	
	public void open() {
		super.open();
		System.out.println(" ????????? ");
	}
	
	public void close() {
		super.close();
		System.out.println(" ????????? ");
	}
	
	public void call() {
		super.call();
		System.out.println(" ????????? ");
	}
}
