
public class Polymorphism2 {
	public static void main (String [] args) {
		
		Ham[] food = { new Spam(), new Yam(), new Ham(), new Lamb() };
		
		for(int i = 0; i<food.length; i++) {
			
			System.out.println(food[i]);
			food[i].a();
			food[i].b();
			System.out.println();
			
		}
		
	}
}
