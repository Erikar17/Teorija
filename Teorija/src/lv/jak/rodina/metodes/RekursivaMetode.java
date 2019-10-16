package lv.jak.rodina.metodes;

public class RekursivaMetode {
        public static String skaitluVirkne(int skaitlis) {
		if (skaitlis !=1) {
			return skaitluVirkne(skaitlis - 1) + skaitlis + " ";
			}
		else {
			return "1 ";
		}
		
		
		
		
		
		
	}

}
   