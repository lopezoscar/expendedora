package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import exceptions.DAOException;
import jdbc.DBManager;
import modelo.Expendedora;
import modelo.Producto;

public class ExpendedoraDAOImpl implements ExpendedoraDAO{

	@Override
	public void agregarProducto(Expendedora exp, Producto p) throws DAOException{
		// TODO DEBERIA GUARDAR EN LA DB
		System.out.println("AGREGANDO A LA DB "+ exp.toString() + " "+p.toString());
		
		//TODO Crear insert productos
		//INSERT INTO PRODUCTOS (MARCA, MODELO) VALUES (?,?)
		//TODO Crear insert stock
		//INSERT INTO STOCK (PRODUCTO_ID, STOCK) VALUES (?,?)
		String marca = p.getMarca();
        String modelo = p.getModelo();
        int fichas = p.getFichas();

        String sql = "INSERT INTO productos (marca, modelo, fichas) VALUES ('" + marca + "', '" + modelo + "', '" + fichas + "')";
        Connection c = DBManager.connect();
        try {
            Statement s = c.createStatement();
            s.executeUpdate(sql);
            c.commit();
        } catch (SQLException e) {
            try {
                e.printStackTrace();
                c.rollback();
            } catch (SQLException e1) {
                throw new DAOException(e);
            }
        } finally {
            try {
                c.close();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
		
	}
	
	 public Collection<Producto> listarTodos() throws DAOException{
	        Collection<Producto> resultado = new ArrayList<>();
	        
	        Connection c = DBManager.connect();
	        try {
	            Statement s = c.createStatement();
	            ResultSet rs = s.executeQuery("SELECT * FROM PRODUCTOS");
	            while(rs.next()) {
	                int id = rs.getInt("id");
	                String marca = rs.getString("marca");
	                String modelo = rs.getString("modelo");
	                int fichas= rs.getInt("fichas");

	                Producto unProducto = new Producto(marca, modelo,fichas);

	                resultado.add(unProducto);
	                System.out.println(unProducto);
	            }
	        } catch (SQLException e) {
	            try {
	                e.printStackTrace();
	                c.rollback();
	            } catch (SQLException e1) {
	                throw new DAOException(e);
	            }
	        } finally {
	            try {
	                c.close();
	            } catch (SQLException e1) {
	                e1.printStackTrace();
	            }
	        }

	        return resultado;
	    }

}
