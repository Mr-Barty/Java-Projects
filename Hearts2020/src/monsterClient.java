
public class monsterClient {
	
	public static void main(String[] args) {
		
		monster monsterOne = new monster();
		
		monster monsterTwo = new monster("Mike Ass", 1, 2, "Green", false, 50);
		
		System.out.println(monsterTwo.getScary());
		
		monsterTwo.scareMe();
		
		monsterTwo.setWeight(75);
		
		System.out.println(monsterTwo);
		
	}
	
}
