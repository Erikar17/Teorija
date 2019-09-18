package lv.jak.rodina.metodes;

public class MainClass {
		
	public static void main(String[] args) {
		Metodes m = new Metodes();
		//metožu izsaukšana jeb startēšana
		m.izvaditTekstu();
		
		int x = m.atgrieztVertibu();
		System.out.println("Atgrieztā vērtība" + x);
		
		m.parametruMetode(15, 256.5);
		
	}
}