import java.util.Scanner; 
public class HelloWorld {

	public static void main(String[] args) {

		System.out.println("구구단 중 출력할 단은? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("number : " + number);
		
		if(number<2) {
			System.out.println("2보다 낮음");
		}
		else if(number>9) {
			System.out.println("9보다 크다");
		}
		else {
		for(int i=1;i<10;i++) {
			System.out.println("값은" + i * number);
			}		
		}
	}			
}
