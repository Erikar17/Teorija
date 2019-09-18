package lv.jak.rodina.datnes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FailaNolasisana {
public String readFile(String fileName) {
	String teksts = "";
	
	File file = new File(fileName);
	try {
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
			teksts += (line + "\n");
			
		}
		
	}
	catch (FileNotFoundException e) {
		System.out.println("Nav izvēlētā faila!");
		//e.printStackTrace();
		
	}
	
	catch (IOException e) {
	System.out.println("Izvēlēto failu nav izdevies nolasīt!");
	e.printStackTrace();
	}
	
	return teksts;
}
}
