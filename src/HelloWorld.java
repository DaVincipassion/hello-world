import java.util.*;

class HelloWorld{
	public static void main(String[] args) {

		Set set = new TreeSet();
		
		for(int i =0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45) + 1;
			set.add(num);
		}
		System.out.println(set);
	}
}
