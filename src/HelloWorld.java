import java.util.*;
public class HelloWorld {
	public static void main(String[] args) {
	
		int[] lotto = new int[6];
		
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=(int)(Math.random()*45+1);
			
			for(int j=0;j<i;j++) {
			if(lotto[i]==lotto[j]) {
				i--;
			 break;
			}
		}
	}
		for(int i=0;i<lotto.length;i++) {
			for(int j=i+1;j<lotto.length;j++) {
				if(lotto[i]>lotto[j]) {
					int tmp = lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=tmp;
				}
					
			}
		}
		for(int i=0;i<lotto.length;i++)
			System.out.printf("%d ",lotto[i]);
		
	}

}