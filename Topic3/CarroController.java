package Topic3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

public class CarroController {
	@Autowired
	private CarritoService carritoService;

	@RequestMapping("/api/carros")
	public List<Carro> getCarrosList(){
		return carritoService.getCarrosList();
	}

	@RequestMapping(method = RequestMethod.DELETE,value = "/api/carros")
	public void deleteCarro(int id){
		carritoService.removeCarro(id);
	}

	@RequestMapping(method = RequestMethod.POST,value = "/api/carros")
	public void createCarro(){
		carritoService.addCarro();
	}

	@RequestMapping(method = RequestMethod.POST,value = "/api/carros/{id}/productlist")
	public void addProduct(@PathVariable int id,@RequestParam String name) {
		carritoService.addProduct(id,name);
	}

	@RequestMapping(method = RequestMethod.DELETE,value = "/api/carros/{id}/productlist")
	public void deleteProduct(@PathVariable int id,String name ) {
		carritoService.deleteProduct(id,name);
	}

	@RequestMapping(method = RequestMethod.GET,value = "api/carros/{id}")
	public Carro getCarrito(@PathVariable int id){
		return carritoService.getCarro(id);
	}

	@RequestMapping ("/api/carros/{id}/productlist")
	public ResponseEntity getProductList(@PathVariable int id){
		return	carritoService.getProductlist(id);
	}

	@RequestMapping ("/api/carros/{id}/purchase")
	public ResponseEntity closeCarro(@PathVariable int id) {
		return carritoService.closeCarro(id);
	}
}
