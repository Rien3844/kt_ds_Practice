package homework.inheritance;

public class ConvenienceStore extends Mart {
	private float point;
	
	public ConvenienceStore(String productName, int productPrice) {
		super(productName, productPrice);
	}

	public float getPoint() {
		return point;
	}

	public void setPoint(float point) {
		this.point = point;
	}

}

//+ 포인트 혜택