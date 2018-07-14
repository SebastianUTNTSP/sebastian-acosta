package Topic3;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service public class CarritoService {

	private List<Carro> cartList = new ArrayList<>(Arrays.asList(new Carro()));

	public List<Carro> getCarrosList() {
		return cartList;
	}

	public Carro getCarro(int id) {
		return cartList.stream().filter(t -> t.getId() == (id)).findFirst().get();
	}

	public void addCarro() {
		cartList.add(new Carro());
	}

	public void removeCarro(int id) {
		if (id < cartList.size()) {
			cartList.remove(id);
		}
	}
	//Product methods

	public void addProduct(int id, String name) {
		Producto p1 = new Producto(name);
		for (int i = 0; i < cartList.size(); i++) {
			Carro c = cartList.get(i);
			if (c.getId() == id) {
				c.getProductlist().add(p1);
			}
		}
	}

	public void deleteProduct(int id, String name) {
		for (int i = 0; i < cartList.size(); i++) {
			Carro c = cartList.get(i);
			if (c.getId() == id && c.getProductlist().size() != 0) {
				Producto b;
				for (int j = 0; j < c.getProductlist().size(); j++) {
					b = c.getProductlist().get(j);
					if (b.getName().equals(name)) {
						c.getProductlist().remove(j);
					}

				}

			}
		}
	}

	public ResponseEntity getProductlist(int id) {
		Carro c;
		for (int i = 0; i < cartList.size(); i++) {
			c = cartList.get(i);
			if (c.getId() == id) {

				return ResponseEntity.ok(c.getProductlist());
			}
		}
		return ResponseEntity.notFound().build();
	}

	public ResponseEntity closeCarro(int id) {
		for (int i = 0; i < cartList.size(); i++) {
			Carro c = cartList.get(i);
			if (c.getId() == id && c.getProductlist().size() != 0) {
				Producto b;
				ArrayList totalprice = new ArrayList();
				double money = 0;
				for (int j = 0; j < c.getProductlist().size(); j++) {
					b = c.getProductlist().get(j);
					money = b.printPreciototal() + money;
					totalprice.add(b.getName());
					totalprice.add(b.getPrecio());
				}
				totalprice.add("Total");
				totalprice.add(money);
				return ResponseEntity.ok(totalprice);
			}
		}
		return ResponseEntity.notFound().build();
	}
}