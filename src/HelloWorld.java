import java.util.*;

class HelloWorld{
	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList(); //ť �������̽��� ����ü�� ��ũ�帮��Ʈ ���
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("= Stack =");
		while(!st.empty()) {
			System.out.println(st.pop()); //���ÿ��� ��� �ϳ��� ������ ���
		}
		System.out.println("= Queue =");
		while(!q.isEmpty()) {
			System.out.println(q.poll());//ť���� ��� �ϳ��� ������ ���
		}
	}
}