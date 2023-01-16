

  class HelloWorld{
	public static void main(String[] args) {
	
		
		try {
			Exception e = new Exception("고의로 발생시켰음");
			throw e;
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("예외메시지 : "+e.getMessage());
			
	}
		System.out.println("프로그램이 정상 종료되었음");
	}
}
	