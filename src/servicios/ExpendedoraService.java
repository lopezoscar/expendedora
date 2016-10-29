package servicios;

import java.util.Collection;

import exceptions.DAOException;
import exceptions.ServicioException;
import modelo.Expendedora;
import modelo.Producto;

public interface ExpendedoraService {

	public void agregarProducto(Expendedora exp, Producto p) throws ServicioException;//Firma
	
	public Collection<Producto> listarTodos() throws ServicioException; 
	
	public void comprar(Producto p, int fichas);
}
