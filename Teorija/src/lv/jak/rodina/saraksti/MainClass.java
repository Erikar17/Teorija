package lv.jak.rodina.saraksti;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {

		Auto auto;
		List<Auto> autoList = new ArrayList<Auto>();
		Scanner input = new Scanner(System.in);

		int darbiba;
		do {
			System.out.println("Auto saraksts");
			System.out.println("1 - pievienot jaunu ierakstu");
			System.out.println("2 - labot ierakstu");
			System.out.println("3 - dzēst ierakstu");
			System.out.println("0 - beigt darbu");
			System.out.println("Izvēlieties darbību");
			darbiba = input.nextInt();

			switch (darbiba) {
			case 1:
				System.out.println("Jauna auto pievienošana");
				System.out.println("Ievadiet auto marku: ");
				String marka = input.next();
				System.out.println("Ievadiet auto modeli: ");
				String modelis = input.next();
				System.out.println("Ievadiet auto gadu: ");
				int gads = input.nextInt();

				// izveido auto klases objektus ar ievadītajiem datiem
				auto = new Auto(marka, modelis, gads);
				// jaunizveidoto objektu ievieto AutoList sarakstā

				autoList.add(auto);

				for (Auto a : autoList) {
					System.out
							.println("Marka: " + a.getMarka() + "Modelis: " + a.getModelis() + "Gads: " + a.getGads());
				}

				break;

			case 2:
				
				System.out.println("Esoša ieraksta labošana");
				System.out.println("Ievadiet objekta kārtas numuru");
			    
				break;
			case 3:

				break;

			case 0:
				System.out.println("Darbs beigts!");
				break;

			default:
				System.out.println("Kļūda!Nav tādas darbības!");

				break;
			}

		} while (darbiba != 0);

	}
}