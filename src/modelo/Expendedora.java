package modelo;

import java.util.ArrayList;
import java.util.List;

public class Expendedora {
	
	private List<Producto> productos = new ArrayList<Producto>();
	
	public void agregarProducto(Producto p){
		productos.add(p);
	}
	
	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
}
