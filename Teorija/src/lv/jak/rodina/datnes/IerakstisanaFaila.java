package lv.jak.rodina.datnes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IerakstisanaFaila {
	
	    public static void writeToFile(String fileName) {
		File file = new File(fileName);
		
		
		
		FileWriter fw;
		
		try {
			if (!file.exists()) {
			  file.createNewFile();
			}
			//FileWriter objekts katru reizi pārrakstīs datnes saturu
			//fw = new FileWriter(file);
			//FileWriter objekts katru reizi papildinās datnes saturu 
			//true - norāda, ka datnes saturu ir jāpapildina (parametrs APPEND)
			fw = new FileWriter(file, true);
			fw.write("Šis ir piemērs\nsatura ierakstīšanai failā!\n");
			String text = "lskdjfskldf[";
			fw.write(text + "\n");
			fw.flush();
			
		   fw.close();
			
			System.out.println("Fails veiksmīgi izveidots!");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Fails nav izveidots!");
			System.out.println("Skatīt kļūdas paziņojumu!");
			e.printStackTrace();
		}
		
		
	}

}
