
class HelloWorld{
	static long startTime = 0;
	public static void main(String[] args)throws Exception {
	
		ThreadEx11 th1 = new ThreadEx11();
		ThreadEx11_2 th2 = new ThreadEx11_2();
		th1.start();
		th2.start();
		startTime = System.currentTimeMillis();
		
		try {
			th1.join();
			th2.join();
		}catch(InterruptedException e) {}
		
		System.out.println("소요시간:"+(System.currentTimeMillis()-HelloWorld.startTime));
	}
}
class ThreadEx11 extends Thread {
	public void run() {
		for(int i =0; i<300; i++) {
			System.out.print(new String("-"));
		}
	}
}
class ThreadEx11_2 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print(new String("|"));
		}
	}
}