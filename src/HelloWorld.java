import java.util.*;
class Point {
	int x;
	int y;
}
class Circle{
	Point p;
	int r;
	Circle(){
		p = new Point(); //생성자로 초기화!!!!
	}
}
public class HelloWorld {
	public static void main(String[] args) {
	
		Circle c = new Circle();
		c.p.x = 1;
		c.p.y = 2;
		c.r = 3;
		System.out.println(c.toString());
		System.out.println("c.p.x:"+c.p.x);
		System.out.println("c.p.y:"+c.p.y);
		System.out.println("c.r:"+c.r);
		         
	}
}