import java.util.*;
public class HelloWorld {
	public static void main(String[] args) {
		
		int score = 0;
		char grade = ' ';
		
		System.out.println("����� ������ �Է��ϼ���.");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();    //ȭ���� ���� �Է¹��� ������ tmp�� ����
		score = Integer.parseInt(tmp);      //�Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ
		
		switch(score/10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
		break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'd';
			break;
			default:
				grade = 'F';
				
		}
		System.out.println("����� ������"+grade+"�Դϴ�.");
	}
	
		
}
