package lv.jak.mantošana;

public class MainClass {
	public static void main(String[] args) {
	
	KlaseB klaseb = new KlaseB();
	
	System.out.println(klaseb.b + klaseb.a);

	klaseb.a = -9;
	
	KlaseA klasea = new KlaseA();
	klasea.a = -9;
	
	KlaseA KlaseA2 = new KlaseA();
	System.out.println(KlaseA2.a);
}
}