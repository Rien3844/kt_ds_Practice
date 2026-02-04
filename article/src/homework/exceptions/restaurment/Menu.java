package homework.exceptions.restaurment;

public class Menu {

	private Item item;
	private int weight;
	private double alcohol;
	private int price;
	private int stock;
	private String name;

	public Menu(Item item, int weight, double alcohol, int price, int stock, String name) {
		this.item = item;
		this.weight = weight;
		this.alcohol = alcohol;
		this.price = price;
		this.stock = stock;
		this.name = name;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getWeight() {
		return this.weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getAlcohol() {
		return this.alcohol;
	}

	public void setAlcohol(double alcohol) {
		this.alcohol = alcohol;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public String getName() {
		return this.name;
	}

}