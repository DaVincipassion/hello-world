import javax.swing.JOptionPane;
class HelloWorld{
	public static void main(String[] args)throws Exception {
	
		ThreadEx5 th1 = new ThreadEx5();
		th1.start();
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
		System.out.println("�Է��Ͻ� ���� "+ input + "�Դϴ�");
	}
}
		class ThreadEx5 extends Thread{
			public void run() {
		for(int i=10; i>0;i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
		}
	}
	
}