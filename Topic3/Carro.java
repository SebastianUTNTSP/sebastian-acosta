package Topic3;


import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Carro {
	private static final AtomicInteger count = new AtomicInteger();

	private int id;
	private ArrayList<Producto> productlist = new ArrayList<>();

	public Carro() {
		this.id = count.incrementAndGet();
	}

	@Override public String toString() {
		return "Carro{" + "id=" + id + ", productlist=" + productlist + '}';
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Producto> getProductlist() {
		return productlist;
	}

	public void setProductlist(ArrayList<Producto> productlist) {
		this.productlist = productlist;
	}
}

