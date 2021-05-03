package GameMernisProject;

public class Game implements Entity{

	private String name;
	private String publisher;
	private int unitPrice;

	public Game() {
		
	}
	
	public Game(String name, String publisher, int unitPrice) {
		super();
		this.name = name;
		this.publisher = publisher;
		this.unitPrice = unitPrice;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
}
