
class HelloWorld{
	public static void main(String args[]) {
        System.out.println("main����");
		firstMethod();
		System.out.println("main����");
		
}
	static void firstMethod(){
		System.out.println("first����");
		secondMethod();
		System.out.println("first����");
	}
	static void secondMethod(){
		
		System.out.println("secondMethod()����");
		System.out.println("secondMethod()����");
		
	}
}