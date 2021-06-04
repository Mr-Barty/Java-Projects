
// Fields
public class monster {
	
	private int eyes;
	
	private int arms;
	
	private String name;
	
	private String hairColor;
	
	private boolean scary; 
	
	private double weight; 
	
	// Constructors
	public monster() {
		
		
		eyes = 0;
		
		arms = 0;
		
		name = " ";
		
		hairColor = " ";
		
		scary = false;
		
		weight = 0.0;
		
	}
	// Override
	public monster(String name, int eyes, int arms, String hairColor, boolean scary, double weight) {
		
		this.name=name;
		
		this.eyes=eyes;
		
		this.arms=arms;
		
		this.hairColor=hairColor;
		
		this.scary=scary;
		
		this.weight=weight;
		
	}
	// Override To String
	public String toString() {
		
		String report = "Name: " + name + "\n" + "Eyes: " + eyes + "\n" + "Arms: " + arms + "\n" + "Hair Color: " + hairColor +"\n" + "Scary: " + scary + "\n" + "Weight: " + weight + "\n"; 
		
		return report;
	}
	// Assessors
	public String getName() {
		
		return name;
		
	}
	public int getEyes() {
		
		return eyes;
		
	}
	public int getArms() {
		
		return arms;
		
	}
	public String getHairColor() {
		
		return hairColor;
		
	}
	public boolean getScary() {
		
		return scary;
		
	}
	public double getWeight() {
		
		return weight;
		
	}
	public void scareMe() {
		
		if (this.scary == true) {
			
			System.out.println("Boo!");
			
		} else {
			
			System.out.println("Im Lame!");
			
		}
		
	}
	// Mutators
	public void setWeight(int weight) {
		
		this.weight = weight;
		
	}
	
}
