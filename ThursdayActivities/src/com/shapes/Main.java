package com.shapes;

public class Main {
	public static void main(String[] args) {
		shape c=new Circle();
		shape t=new Triangle();
		shape s=new Square();
		c.draw();
		c.erase();
		t.draw();
		t.erase();
		s.draw();
		s.erase();
	}

}
