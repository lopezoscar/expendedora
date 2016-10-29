package dao;

import java.util.Collection;

import exceptions.DAOException;
import modelo.Expendedora;
import modelo.Producto;

public interface ExpendedoraDAO {
	public void agregarProducto(Expendedora exp, Producto p) throws DAOException;
	public Collection<Producto> listarTodos() throws DAOException;

}
