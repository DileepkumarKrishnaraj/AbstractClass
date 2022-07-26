package demo;

public abstract class Bike {
	Bike(){
		System.out.println("Bike has been started...");
	}
	abstract void run();
	void changeGear() {
		System.out.println("Change gear...");
	}
}

class Honda extends Bike {
	void run() {
		System.out.println("Running Successfully.");
	}
}

class TestAbstraction{
public static void main(String[] args) {
	Bike obj = new Honda();
	obj.run();
	obj.changeGear();
}
}

