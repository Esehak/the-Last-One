package w1d6_2;

public class Client {
	public static void main(String[] args){

	Square sq= new Square();
	Invoker in= new Invoker();
	String st= in.createSquare(sq);
	String st1 = in.createBy2(sq);
	String st2 = in.create3(sq);
	System.out.println(st + "\n" + st1 + "\n" + st2);
	
}
}