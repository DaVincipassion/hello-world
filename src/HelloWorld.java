import java.util.*;
public class HelloWorld {
	public static void main(String[] args) {
	
		System.out.println("Card.width = " + Card.width);  //객체 생성 없이 바로 사용가능하다 클래스 변수이기에
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + "," + c1.number + "크기는 "+ c1.width + c1.height);
		System.out.println("c2은 " + c2.kind + "," + c2.number + "크기는 "+ c2.width + c2.height);
		System.out.println("c1의 width height 각각 50, 80으로 변경합니다");
		
		c1.width = 50;    //c1.width라고 쓰면 인스턴스 변수로 착각하기 쉽기에 Card.width라고 써주는게 좋다
		c1.height = 80;
		System.out.println(c1.kind +","+ c1.number +","+ c1.width +","+ c1.height);
		System.out.println(c2.kind +","+ c2.number +","+ c2.width +","+ c2.height);
		//c2도 바뀐걸 알 수 있다 c1 인스턴스 변수인줄 알고 바꿨다가 c2도 바뀌어 버림 클래스 변수이기에 c1,c2 모두 하나의 클래스 변수를 저장하고있다.
		
		Card c3 = new Card();
		int result = c3.add(1,3);
		System.out.println(result);
	}

}
class Card{
	String kind;
	int number;
	static int width = 100;
	static int height = 50;
	
	int add(int a,int b) {
		int result = a+b;
		return result;
	}
}