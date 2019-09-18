package lv.jak.rodina.metodes;

public class Metodes {

	//1.Metodes ar atgriežamo tipu (void, int, scanner. utt.)
			//void - norāda, ka tikai izpilda darbības, beigās NAV return
			//Jebkurš datu tips, klase, masīvs, utt. - metodes pēdējā rindā ir RETURN
			
			//Piemērs ar void
			public void izvaditTekstu() {
				System.out.println("Šī ir void metode!");
				
				
			}
			
			//piemērs ar atgriežamo tipu - int
			public int atgrieztVertibu() {
				System.out.println("Šī ir atgriežamā metode!");
				return 5;
				
				
				//2.Metodes ar parametriem
				//Metodēm parastajās iekavās norādam, kādas datu tipa vērtības ir nepieciešamas, lai metodi iedarbinātu(call)
				//Parametram norāda datu tipu un tā nosaukumu
	public void parametruMetode(int procenti, double vertiba) {
		System.out.println(procenti + "% no" + vertiba + " = " + (vertiba * procenti / 100));
	}
}
