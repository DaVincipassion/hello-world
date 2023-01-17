
class HelloWorld{
	public static void main(String[] args)throws Exception {
	
		ThreadEx6 th1 = new ThreadEx6();
		ThreadEx6_2 th2 = new ThreadEx6_2();

		th2.setPriority(7);
		
		System.out.println(th1.getPriority());
		System.out.println(th2.getPriority());
		th1.start();
		th2.start();
	}
	
}
class ThreadEx6 extends Thread{
	public void run() {
		for(int i=0;i<300;i++) {
			System.out.println("-");
			for(int x=0;x<10000000;x++);
		}
	}
}
class ThreadEx6_2 extends Thread{
	public void run() {
		for(int i=0;i<300;i++) {
			System.out.println("|");
			for(int x=0;x<10000000;x++);
		}
	}
}