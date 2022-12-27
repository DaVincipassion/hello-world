
class HelloWorld{
	public static void main(String args[]) {
        System.out.println("main시작");
		firstMethod();
		System.out.println("main끝남");
		
}
	static void firstMethod(){
		System.out.println("first시작");
		secondMethod();
		System.out.println("first끝남");
	}
	static void secondMethod(){
		
		System.out.println("secondMethod()시작");
		System.out.println("secondMethod()끝남");
		
	}
}