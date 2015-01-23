/**
 * @author - April Domingo and Charles Lee
 * @since - 2014/01/23
 * @version - branch - NumberGenerator Version 1.0
 */

import java.util.Random;

public class NumberGenerator {
	
	public static void main(String[] args) {
		int result = random();
		System.out.print(result);
	}
	
	public static int random() {
	
	Random rand = new Random ();
	int number = rand.nextInt(12)+1;
	return number;
	
	}
}
