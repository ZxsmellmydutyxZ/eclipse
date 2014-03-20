
public class TestCoin {


public static void main(String[] args) {
	Coin nickel = new Coin();
	
	nickel.flipCoin();
	
	if (nickel.showFace() == 0) {
		System.out.println(nickel.toString() + " face up");
	} else {
		System.out.println(nickel.toString() + " face down");
	}
	
	
	
	
	
	
	}
}