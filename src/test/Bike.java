package test;

abstract class Bike {
	abstract void run();
	
	void breaks() {
		System.out.println("breaking");
	}
}