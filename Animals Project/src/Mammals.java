
public class Mammals {
	
	private boolean hasBackbone;
	
	private boolean producesMilk;
	
	private String hairColor;
	
	private double bodyTempF;
	
	private int numberLegs;
	
	private boolean liveBirth;
	
	public Mammals () {
		
		hasBackbone = true;
		
		producesMilk = true;
		
		hairColor = "brown";
		
		bodyTempF = 0;
		
		numberLegs = 0;
		
		liveBirth = false;
		
	}
	
	public boolean getHasBackbone () {
		
		return hasBackbone;
		
	}
	
	public boolean getProducesMilk () {
		
		return producesMilk;
		
	}
	
	public String getHairColor () {
		
		return hairColor;
		
	}
	
	public double getBodyTempF () {
		
		return bodyTempF;
		
	}
	
	public int getNumberLegs () {
		
		return numberLegs;
		
	}
	
	public boolean getLiveBirth () {
		
		return liveBirth;
		
	}
	
	public void setHairColor (String hairColor) {
		
		this.hairColor = hairColor;
		
	}
	
	public void setBodyTempF (double  bodyTempF) {
		
		this.bodyTempF = bodyTempF;
		
	}
	
	public double convertCelsius () {
		
		double bodyTempC;
		
		bodyTempC = ((bodyTempF - 32) / 1.8);
		
		return bodyTempC;
		
	}
}
