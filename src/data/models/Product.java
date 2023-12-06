package data.models;

public class Product {
	private String name;
	private String description;
	private String type;
	private String price;
	public Product (String name, String description, String type, String price) {
		this.name = name;
		this.description = description;
		this.type = type;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return this.name + "," + this.description + "," + this.type + "," + this.price;
	}
}
