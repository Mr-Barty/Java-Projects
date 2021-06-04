
public class Hearts {

	private String color;
	
	private int size;
	
	private String saying;
	
	private int calories;
	
	private double costPerPound;
	
	private boolean availability; 
	
	private int stock;
	
	public Hearts(String color, int size, String saying, double costPerPound, int stock) {
		
		this.color = color;
		
		this.size = size;
		
		this.saying = saying;
		
		this.costPerPound = costPerPound;
		
		this.stock = stock;
		
	}
	
	
	public Hearts() {
		
		color = "Gray";
		
		size = 0;
		
		saying = "You Suck";
		
		calories = 0;
		
		costPerPound = 0;
		
		availability = false;
		
		stock = 0;
		
	}
	
	public String getColor() {
		
		return color;
		
	}
	public int getSize() {
		
		return size;
		
	}
	public String getSaying() {
		
		return saying;
	}
	public int getCalories() {
		
		return calories;
		
	}
	public double getCost() {
		
		return costPerPound;
		
	}
	public boolean getAvailable() {
		
		return availability;
		
	}
	public int getStock() {
		
		return stock;
		
	}
	public String getReport() {
		
		String report = "Color: " + color + "\n" + "Size: " + size + "\n" + "Saying: " + saying + "\n" + "Calories: " + calories + "\n" + "Cost: " + costPerPound + "\n" + "Stock: " + stock;
		
		return report;
		
	}
	public void adjPrice(double price) {
		
		this.costPerPound = this.costPerPound * price;
		
	}
	public void adjStock(int newStock) {
	
		this.stock = newStock;
		
		for (int x = 0; x <= 1; x++) {
			
			newStock++;
			
		}
		
	}
	public void inStock(int stock) {
		
		this.stock = stock;
		
		if (stock >= 0) {
			
			this.availability = true;
			
		} else {
			
			this.availability = false;
			
		}
		
	}
	
}
