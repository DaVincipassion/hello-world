class Data{int x;}
class HelloWorld{
	public static void main(String args[]) {
        Data d = new Data();
        d.x=10;
        

        Data d2 = copy(d);
       System.out.println(d.x);
        System.out.println(d2.x);
        
	}
	static Data copy(Data d) {
		Data tmp = new Data();
		tmp.x = d.x;
		return tmp;
	}
}