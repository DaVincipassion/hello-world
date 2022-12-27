class Data{int x;}
class HelloWorld{
	public static void main(String args[]) {
        int x[]= {10};
        
        System.out.println(x[0]);
        
        change(x);
        System.out.println("after change");
        System.out.println("main x"+x[0]);
        
	}
	static void change(int x[]) {
		x[0] = 1000;
		System.out.println("change:x"+x[0]);
	}
}