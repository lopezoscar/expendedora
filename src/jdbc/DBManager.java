package jdbc;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.h2.tools.Server;

public class DBManager {

	private static final String DB_DRIVER = "org.h2.Driver";
	private static final String DB_BASE_URL = "jdbc:h2:tcp://localhost//{DIR}";
	private static final String DB_NAME = "/expededora";
	private static final String DB_USERNAME = "sa";
	private static final String DB_PASSWORD = "";

	public static Connection connect() {
		Connection c = null;
		Server server = null;
		try {
            server = Server.createTcpServer("-tcpAllowOthers").start();
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);
		}
		try {
			final String url = DB_BASE_URL.replace("{DIR}", obtenerUbicacionBase()) + DB_NAME;
			//System.out.println(url);
			c = DriverManager.getConnection(url, DB_USERNAME, DB_PASSWORD);
			c.setAutoCommit(false);
		} catch (SQLException e) {
			e.printStackTrace();
			System.exit(0);
		}

		return c;
	}

	private static String obtenerUbicacionBase() {
		File currDir = new File("h2/base_de_datos/");
		return currDir.getAbsolutePath();
	}

}
