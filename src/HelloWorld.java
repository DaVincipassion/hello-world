class Outer3{
	int value = 10;  //Outer.this.value
	
	class Inner{
		int value = 20;  //this.value
		
		void method() {
			int value = 30;
			System.out.println("value:"+value);
			System.out.println("this.value:"+this.value);
			System.out.println("Outer3.this.value:"+Outer3.this.value);
		}
	}
}
class HelloWorld{
	public static void main(String[] args) {
		Outer3 outer = new Outer3();
		Outer3.Inner inner = outer.new Inner();
		inner.method();
	}
}
	