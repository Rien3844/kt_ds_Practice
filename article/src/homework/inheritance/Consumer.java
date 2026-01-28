package homework.inheritance;

public class Consumer {
	private String name;
	private int wallet;
	private int consRating;
	private float point;

	public Consumer(String name, int wallet, int consRating, float point) {
		this.name = name;
		this.wallet = wallet;
		this.consRating = consRating;
		this.point = point;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getWallet() {
		return this.wallet;
	}
	public void setWallet(int wallet) {
		this.wallet = wallet;
	}

	public int getConsRating() {
		return this.consRating;
	}
	public void setConsRating(int consRating) {
		this.consRating = consRating;
	}

	public float getPoint() {
		return this.point;
	}
	public void setPoint(float point) {
		this.point = point;
	}

}
