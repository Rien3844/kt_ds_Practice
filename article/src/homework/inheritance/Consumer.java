package homework.inheritance;

public class Consumer {
	private String name;
	private int wallet;
<<<<<<< HEAD
	private String consRating;
	private float point;

	//consRating == 1 => "일반등급"
	//consRating == 2 => "VIP등급"
	//consRating == 3 => "VVIP등급"
	public Consumer(String name, int wallet, String consRating, float point) {
=======
	private int consRating;
	private float point;

	public Consumer(String name, int wallet, int consRating, float point) {
>>>>>>> ff61d906423049f4f222491edbbeefc5fb33ea93
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

<<<<<<< HEAD
	public String getConsRating() {
		return this.consRating;
	}
	public void setConsRating(String consRating) {
=======
	public int getConsRating() {
		return this.consRating;
	}
	public void setConsRating(int consRating) {
>>>>>>> ff61d906423049f4f222491edbbeefc5fb33ea93
		this.consRating = consRating;
	}

	public float getPoint() {
		return this.point;
	}
	public void setPoint(float point) {
		this.point = point;
	}

<<<<<<< HEAD
}
=======
}
>>>>>>> ff61d906423049f4f222491edbbeefc5fb33ea93
