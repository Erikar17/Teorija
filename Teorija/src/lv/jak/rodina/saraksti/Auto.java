package lv.jak.rodina.saraksti;

public class Auto {
   public String marka;
   public String modelis;
   public int gads;
   
   public Auto() {}
	   
	public Auto(String marka, String modelis, int gads) {
	setMarka(marka);
	setModelis(modelis);
	setGads(gads);
	
		
		
		
		
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModelis() {
		return modelis;
	}

	public void setModelis(String modelis) {
		this.modelis = modelis;
	}

	public int getGads() {
		return gads;
	}

	public void setGads(int gads) {
		this.gads = gads;
	}
   }

