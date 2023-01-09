import java.util.*;

class HelloWorld{
	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList(); //큐 인터페이스의 구현체인 링크드리스트 사용
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("= Stack =");
		while(!st.empty()) {
			System.out.println(st.pop()); //스택에서 요소 하나를 꺼내서 출력
		}
		System.out.println("= Queue =");
		while(!q.isEmpty()) {
			System.out.println(q.poll());//큐에서 요소 하나를 꺼내서 출력
		}
	}
}