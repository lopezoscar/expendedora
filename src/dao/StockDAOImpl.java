package dao;

import modelo.Producto;

public class StockDAOImpl implements StockDAO{

	@Override
	public void decrementarStock(Producto p) {
		//TODO Hacer update en stock donde el producto.id sea igual al que recibo por parametro.
		//UPDATE PRODUCTOS SET STOCK = p.getStock()-1
	}
	
	public void actualizarStock(Producto p,int cantidad){
		//TODO Invocar sentencia
		//UPDATE PRODUCTOS SET STOCK = cantidad
	}

	@Override
	public int getStock(Producto p) {
		// TODO Ir a la tabla stock a buscar el stock del producto que pasa por parametro
		return 0;
	}

}
