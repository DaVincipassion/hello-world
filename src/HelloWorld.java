
class HelloWorld{
	static long startTime = 0;

	public static void main(String[] args) {
	
		ThreadEx3 th1 = new ThreadEx3();
		th1.start();
		startTime = System.currentTimeMillis();
		
		for(int i = 0; i<300;i++) 
			System.out.printf("%s",new String("-"));
			
			System.out.print(System.currentTimeMillis()-HelloWorld.startTime);
		}
	}
			class ThreadEx3 extends Thread{
				public void run() {
			for(int i=0;i<300;i++) 
				System.out.printf("%s",new String("|"));
				
				System.out.print(System.currentTimeMillis()-HelloWorld.startTime);
			}
		}
	
