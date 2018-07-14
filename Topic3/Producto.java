package Topic3;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.text.DecimalFormat;

public class Producto {

	DecimalFormat d = new DecimalFormat("#.##");
	double r = ThreadLocalRandom.current().nextDouble(0, 100);

	public static final AtomicInteger count = new AtomicInteger();
	private double precio;
	private int id;
	private String name;

	public Producto(String name) {
		this.precio = r;
		this.id = count.incrementAndGet();
		this.name = name;
	}

	@Override public String toString() {
		return "Producto{" + ", id=" + id + ", name='" + name + '\'' + "precio=" + d.format(precio) + '}';
	}

	public String getPrecio() {
		return d.format(precio);
	}
	public double printPreciototal(){
		return precio;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
