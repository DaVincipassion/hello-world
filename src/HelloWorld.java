import java.util.Scanner; 
public class HelloWorld {

	public static void main(String[] args) {

		System.out.println("������ �� ����� ����? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("number : " + number);
		
		for(int i=1;i<10;i++) {
			System.out.println("����" + i * number);
			}			
	}			
}
