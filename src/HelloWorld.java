import java.util.*;
class Point {
	int x;
	int y;
	public String toString() {
		return "x"+x+", y"+y;
	}
}
class Circle extends Point{
	int z;
	
	Circle(int x, int y){    //생성자 
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "x"+x+", y"+y;
	}
}
public class HelloWorld {
	public static void main(String[] args) {
	
		Circle c = new Circle(3,5); //한번에 초기화까지 시켜버림
//		c.x = 1;
//		c.y = 2;
		c.z = 3;
		System.out.println(c);

		         
	}
}