import java.util.*;
public class HelloWorld {
	public static void main(String[] args) {
	
		System.out.println("Card.width = " + Card.width);  //��ü ���� ���� �ٷ� ��밡���ϴ� Ŭ���� �����̱⿡
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1�� " + c1.kind + "," + c1.number + "ũ��� "+ c1.width + c1.height);
		System.out.println("c2�� " + c2.kind + "," + c2.number + "ũ��� "+ c2.width + c2.height);
		System.out.println("c1�� width height ���� 50, 80���� �����մϴ�");
		
		c1.width = 50;    //c1.width��� ���� �ν��Ͻ� ������ �����ϱ� ���⿡ Card.width��� ���ִ°� ����
		c1.height = 80;
		System.out.println(c1.kind +","+ c1.number +","+ c1.width +","+ c1.height);
		System.out.println(c2.kind +","+ c2.number +","+ c2.width +","+ c2.height);
		//c2�� �ٲ�� �� �� �ִ� c1 �ν��Ͻ� �������� �˰� �ٲ�ٰ� c2�� �ٲ�� ���� Ŭ���� �����̱⿡ c1,c2 ��� �ϳ��� Ŭ���� ������ �����ϰ��ִ�.
		
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