package ArrayListEx;

public class Product {
	private int prdNum;
	private String prdName;
	private int prdPrice;
	
	public Product(int prdNum, String prdName, int prdPrice) {
		this.prdNum = prdNum;
		this.prdName = prdName;
		this.prdPrice = prdPrice;
	}

	public int getPrdNum() {
		return prdNum;
	}

	public void setPrdNum(int prdNum) {
		this.prdNum = prdNum;
	}

	public String getPrdName() {
		return prdName;
	}

	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}

	public int getPrdPrice() {
		return prdPrice;
	}

	public void setPrdPrice(int prdPrice) {
		this.prdPrice = prdPrice;
	}
	
	@Override
	public String toString() {
		return "Product [prdNum="+prdNum + ", prdName="+prdName
				+ ", prdPrice=" + prdPrice;
	}
}
