
public class HeartsClient {

	public static void main (String[] args) {
		
		Hearts Group1 = new Hearts("red", 3, "Hi", 5.00, 50);
		
		Hearts Group2 = new Hearts("teal", 5, "Love CS-A", 4.50, 200);
		
		Hearts Group3 = new Hearts("red", 2, "Go Girl!", 3.50, 75);
		
		int store[] = new int[] {Group1.getStock(), Group2.getStock(), Group3.getStock()};
		
		String colorBuyOut[] = new String[] {Group1.getColor(), Group2.getColor(), Group3.getColor(), };
		
		double colorPrice[] = new double[] {Group1.getCost(), Group2.getCost(), Group3.getCost()};
		
		System.out.println(Group1.getReport());
		
		System.out.println();
		
		System.out.println("Total Stock: " + buyOut(store));
		
		System.out.println();
		
		colorOrder("red", colorBuyOut, colorPrice);
		
	}
	public static int buyOut(int[] store) {
		
		int availableHearts = 0;
		
		for (int x = 0; x < store.length; x++) {
			
			availableHearts = store[x] + availableHearts;
			
		}
		
		return availableHearts;
		
	}
	public static void colorOrder(String reqColor, String[] store, double[] price) {
		
		double finalCost = 0;
		
		for (int i = 0; i < 3; i ++) {
			
			if (store[i].equals(reqColor)) {
				
				System.out.println("Has red");
				
				finalCost = finalCost + price[i];
				
				System.out.println(price[i]);
				
			} else {
				
				System.out.println("No red");
				
			}
			
		}
		System.out.println("Your Final Cost is: " + finalCost + " For color: " + reqColor);
	}
}
