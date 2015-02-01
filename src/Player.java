public class Player{
	private static int hp = 15;
	
	public static int takeDamage(int damage){
		hp -= damage;
		
		return hp;
	}
	
	public static int heal(int regen){
		hp += regen;
		
		return hp;
	}
	
	public static int getHP(){
		System.out.println("HP: "+hp);
		return hp;
	}
	
	public static boolean isAlive(){
		if(hp > 0){
			return true;
		}
		
		System.out.println("You are dead.");
		hp = 0;
		return false;
	}
}