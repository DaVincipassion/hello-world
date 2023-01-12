
import java.util.*;
class Product{
}
class Tv extends Product{}
class Audio extends Product{}
class HelloWorld{
	public static void main(String[] args) {

		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Tv> TvList = new ArrayList<Tv>();
	
		productList.add(new Tv());
		productList.add(new Audio());
		
		TvList.add(new Tv());
		TvList.add(new Tv());
		
		printAll(productList);
		
   }
	public static void printAll(ArrayList<Product> list) {
		for(Product p : list)
			System.out.println(p);
	}

}
