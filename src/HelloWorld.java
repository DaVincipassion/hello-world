class Tv{
	boolean power;
	int channel;
	
	void power() { power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
	
}
class CaptionTv extends Tv{
	boolean caption; //캡션상태 (on/off)
	
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text); //캡션 상태가 on(true)일 떄만 text를 보여 준다.
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
      	ctv.caption = true;   //캡션(자막) 기능을 켠다.
      	ctv.displayCaption("Hello, World");
	}
}
	
	
