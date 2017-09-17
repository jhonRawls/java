package cn.ibadi.test;

public class TestB {
	public TestB() {
		System.out.println("B构造函数");
	}
	
	public void say() {
		System.out.println("b say ");
	}
	public static void main(String [] args) {
		TestA a=new TestA();
		TestA ab=new TestA();
		TestA abc=new TestA();
		
	}
}
