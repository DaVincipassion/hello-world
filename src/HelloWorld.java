
class HelloWorld{
	public static void main(String args[]) {
        int n = 21;
        long result = 0;
        for(int i = 1; i<= n; i++) {
        	result = factorial(i);
        	
        	if(result == -1) {
        		System.out.printf("��ȿ���� ���� ��",n);
        		break;
        	}
        	System.out.printf("",i,result);
        }
	}
	static long factorial(int n) {
		if(n<=0 || n>20)return -1;
		if(n<=1) return 1;
			return n* factorial(n-1);
		
	}
}