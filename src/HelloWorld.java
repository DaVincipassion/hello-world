class Tv{
	boolean power;
	int channel;
	
	void power() { power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
	
}
class CaptionTv extends Tv{
	boolean caption; //ĸ�ǻ��� (on/off)
	
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text); //ĸ�� ���°� on(true)�� ���� text�� ���� �ش�.
		}
	}
}
class HelloWorld{
	public static void main(String args[]) {
      	CaptionTv ctv = new CaptionTv();
      	ctv.channel = 10;
      	ctv.channelUp();
      	System.out.println(ctv.channel);
      	ctv.displayCaption("Hello, World");
      	ctv.caption = true;   //ĸ��(�ڸ�) ����� �Ҵ�.
      	ctv.displayCaption("Hello, World");
	}
}
	
	
