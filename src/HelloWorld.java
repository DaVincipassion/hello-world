class Tv{
	String color;
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown( ){ --channel; } 
}

class HelloWorld{
	public static void main(String args[]) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1�� ä�ΰ��� "+t1.channel+"�Դϴ�.");
		System.out.println("t2�� ä�ΰ��� "+t2.channel+"�Դϴ�.");
		t2 = t1;         //t2�� �ּҸ� t1�� ����
		t1.channel = 7;
		System.out.println("t1�� ä�ΰ���"+t1.channel+"���� �����Ͽ����ϴ�.");
		
		System.out.println("t1�� ä�ΰ��� "+t1.channel+"�Դϴ�.");
		System.out.println("t2�� ä���� "+t2.channel+"�Դϴ�.");
	}
}