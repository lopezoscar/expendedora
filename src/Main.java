
import exceptions.ServicioException;
import jdbc.TableManager;
import modelo.Expendedora;
import modelo.Producto;
import pantallas.ClasePrincipal;
import servicios.ExpendedoraService;
import servicios.ExpendedoraServiceImpl;

public class Main {

	public static void main(String[] args) {
		ClasePrincipal ppal = new ClasePrincipal();
		ppal.iniciarManager();
		ppal.showFrame();
		TableManager tm = new TableManager();
		tm.dropProductosTable();
		tm.createProductosTable();
		
		Expendedora expededora = new Expendedora();
		crearProductos(expededora);
		
		
	}
	
	public static void crearProductos(Expendedora expededora){
		ExpendedoraService expendedoraService = new ExpendedoraServiceImpl();
		try{
			expendedoraService.agregarProducto(expededora,new Producto("Coca Cola","Life",4));
			expendedoraService.agregarProducto(expededora,new Producto("Coca Cola","Zero",5));
			expendedoraService.agregarProducto(expededora,new Producto("Coca Cola","Comun",10));
			expendedoraService.agregarProducto(expededora,new Producto("Coca Cola","Light",10));	
		}catch(ServicioException exception){
			System.out.println(exception);
		}
		
	}
}
