package dao;

import modelo.Producto;

public interface StockDAO {
	
	public void decrementarStock(Producto p);
	
	public int getStock(Producto p);

}
