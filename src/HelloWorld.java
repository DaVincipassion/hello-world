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
		Tv t;
		t = new Tv();
		t.channel = 7;
		t.channelUp();
		System.out.println("���� ä���� "+t.channel+"�Դϴ�.");
	}
}