package lv.jak.rodina.klases;
import java.awt.Color;

//1.Ja klase ir paredzēta objektu rakstīšanai, klase nesatur MAIN  metodi
//2. Objekta parametri tiek uzskaitīti KLASES ķermenī(ATRIBŪTI)

public class Suns {
   //Klases atribūti  - vēlams pievienot PUBLIC (pieejamības parametrus)
   //Standartsituācijās tikai definē
	
	
	
     public String vards;
     public  String suga;
     public Color krasa;
     public int vecums;
     public boolean cipots = false;
	
    //klases metodes - objekta darbības
     public void rej() {
        System.out.println("Vau!");
     }
	
}
