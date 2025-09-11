package sec01;

public class Product {
	// 상품번호, 상품명, 가격, 제조회사, 제조일, 재고
	private String num;
	private String name;
	private int price;
	private String maker;
	private String date;
	private int stock;
	
	// 매개변수가 있는 생성자 사용해서 멤버 필드 초기화
	public Product(String num, String name, int price, String maker, String date, int stock) {
		super();
		this.num = num;
		this.name = name;
		this.price = price;
		this.maker = maker;
		this.date = date;
		this.stock = stock;
	}

	// Getters/Setters
	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "상품번호: " + num + ""
				+ "\n상품명:" + name 
				+ "\n가격:" + price 
				+ "\n제조회사: " + maker 
				+ "\n제조일: " + date
				+ "\n재고: " + stock;
	}
}
