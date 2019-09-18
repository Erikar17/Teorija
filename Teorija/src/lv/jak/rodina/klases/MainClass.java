package lv.jak.rodina.klases;

import java.awt.Color;

public class MainClass {

	public static void main(String[] args) {
		//!!!!!!!!!! Balstoties uz vienu klasi var izveidot vairākus objektus !!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		Suns s1 = new Suns();
		s1.vards = "doggo";
		s1.suga = "retriver";
		s1.krasa = Color.black;
		s1.vecums = 3;
		
		System.out.println("1. suņa dati - vārds: " + s1.vards
				+ ", suga: "  + s1.suga 
				+ ", krāsa: " + s1.krasa 
				+ ", vecums: " + s1.vecums 
				+ ", cipots: " + s1.cipots);
		
		s1.cipots = true;
		
		
		Suns s2 = new Suns();
		s2.vards = "dogo";
		s2.suga = "retsdfer";
		s2.krasa = Color.BLUE;
		s2.vecums = 3;
		
		System.out.println("1. suņa dati - vārds: " + s2.vards
				+ ", suga: "  + s2.suga 
				+ ", krāsa: " + s2.krasa 
				+ ", vecums: " + s2.vecums 
				+ ", cipots: " + s2.cipots);


	}

}
