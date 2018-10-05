
public class Mart {
	private Seller seller;         //인터페이스 seller.
	public Mart(Seller seller) {      //mart의 생성자가 seller.
		this.seller = seller;
	}
	public void order() {
		seller.sell();
	}
}