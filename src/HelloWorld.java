import java.util.*;
class Data{
	int x;
}
public class HelloWorld {
	public static void main(String[] args) {
	
		Data d = new Data();
		d.x = 10;
		
		Data d2 = copy(d);  //���� Ŭ���� �ȿ� �־ �������� new����
		System.out.println("d.x : "+ d.x);
		System.out.println("d2.x : "+ d2.x);
		
		}
		static Data copy(Data d) {
			Data tmp = new Data(); //���ο� ��ü tmp����
			tmp.x = d.x;           //d.x�� �� tmp�� ����  
			
			return tmp;            //������ ��ü�� �ּҸ� ��ȯ 
	}
}