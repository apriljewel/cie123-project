import junit.framework.TestCase;

public class NumberGeneratorTest extends TestCase {

	public void testMain() {
	}

	public void testRandom() {
		for (int i=0; i<5; i++) {
		int result = NumberGenerator.random();
		System.out.println(result);
		}
	}

}

