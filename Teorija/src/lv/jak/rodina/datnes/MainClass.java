package lv.jak.rodina.datnes;

public class MainClass {

	public static void main(String[] args) {
	
		IerakstisanaFaila ierakstisana = new IerakstisanaFaila();
		ierakstisana.writeToFile("test.txt");
		
		FailaNolasisana nolasisana = new FailaNolasisana();
		String s = nolasisana.readFile("tests.txt");
		System.out.println();
		System.out.println("No MainClass");
		System.out.println(s);
	}

}
