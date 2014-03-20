
public class Coin {
	public int faceUp;
	public int x;
	
	public Coin() {
		faceUp = 0;
	}
	public void flipCoin() {
       faceUp = (int) (Math.random() * 2);
    }
	public double showFace() {
		return(faceUp);
	}
	public String toString() {
		String a = "The coin is";
		return(a);
	}
}