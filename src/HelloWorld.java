import java.util.*;
class Data{
	int x;
}
public class HelloWorld {
	public static void main(String[] args) {
	
		Data d = new Data();
		d.x = 10;
		
		Data d2 = copy(d);  //같은 클래스 안에 있어서 참조변수 new생략
		System.out.println("d.x : "+ d.x);
		System.out.println("d2.x : "+ d2.x);
		
		}
		static Data copy(Data d) {
			Data tmp = new Data(); //새로운 객체 tmp생성
			tmp.x = d.x;           //d.x의 값 tmp에 복사  
			
			return tmp;            //복사한 객체의 주소를 반환 
	}
}