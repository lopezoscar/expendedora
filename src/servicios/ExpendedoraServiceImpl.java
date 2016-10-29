package servicios;

import java.util.ArrayList;
import java.util.Collection;

import dao.ExpendedoraDAO;
import dao.ExpendedoraDAOImpl;
import dao.StockDAO;
import dao.StockDAOImpl;
import exceptions.DAOException;
import exceptions.ServicioException;
import modelo.Expendedora;
import modelo.Producto;

public class ExpendedoraServiceImpl implements ExpendedoraService{
	
	private StockDAO stockDAO = new StockDAOImpl();;
	ExpendedoraDAO dao = new ExpendedoraDAOImpl();

	@Override
	public void agregarProducto(Expendedora exp, Producto p) throws ServicioException{
		try{
			dao.agregarProducto(exp,p);	
		}catch(DAOException e){
			throw new ServicioException(e);
		}
			
	}
	
	public Collection<Producto> listarTodos() throws ServicioException {
		Collection<Producto> resultado = new ArrayList<>();
		try {
			resultado = dao.listarTodos();
		}catch(DAOException e){
			throw new ServicioException(e);
		}
		return resultado;
	}
	
	private boolean validarFichas(Producto p, int fichas){
		return fichas >= p.getFichas();
	}
	
	private boolean validarStock(Producto p){
		int stock = stockDAO.getStock(p);
		return stock > 0;
	}

	@Override
	public void comprar(Producto p, int fichas) {
		//TODO Pasar el producto seleccionado
		
		if(!validarFichas(p,fichas)){
			System.out.println("no alcanzan las fichas");
			//TODO Crear FichaInsuficientesException
			return;
		}
		
		if(!validarStock(p)){
			System.out.println("No hay stock");
			//TODO Crear StockException
			return;
		}
		
		StockDAO stockDAO = new StockDAOImpl();
		stockDAO.decrementarStock(p);
		
		
		
	}

}
