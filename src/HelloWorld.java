import java.util.*;
class Point {
	int x;
	int y;
	String getLocation() {
		return "x"+x+", y"+y;
	}
}
class Circle extends Point{
	int z;
	String getLocation() {
		return "x"+x+", y"+y;
	}
}
public class HelloWorld {
	public static void main(String[] args) {
	
		Circle c = new Circle();
		c.x = 1;
		c.y = 2;
		c.z = 3;
		
		System.out.println("c.x:"+c.x);
		System.out.println("c.y:"+c.y);
		System.out.println("c.z:"+c.z);
		         
	}
}