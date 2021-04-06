package windowBuilder.gestionVentaDeCoches;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ControladorVenta {

	private static ControladorVenta instance = null;
	public Connection conn = null;
	
	/**
	 * 
	 * @return
	 */
	public static ControladorVenta getInstance () {
		if (instance == null) {
			instance = new ControladorVenta();
		}
		return instance;
	}
	
	/**
	 * 
	 */
	public ControladorVenta() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/tutorialjavacoches?serverTimezone=UTC","java", "1234");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		   

	}
	
	
	/**
	 * 
	 * @return
	 */
	public Venta findPrimero () {
		Venta c = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.venta order by id limit 1");
			if (rs.next()) {
				c = new Venta();
				c.setId(rs.getInt("id"));
				c.setIdCliente(rs.getInt("idcliente"));
				c.setIdConcesionario(rs.getInt("idconcesionario"));
				c.setIdCoche(rs.getInt("idcoche"));
				c.setFecha(rs.getString("fecha"));
				c.setPrecioVenta(rs.getFloat("precioventa"));
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return c;
	}
	

	/**
	 * 
	 * @return
	 */
	public Venta findUltimo () {
		Venta c = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.venta order by id desc limit 1");
			if (rs.next()) {
				c = new Venta();
				c.setId(rs.getInt("id"));
				c.setIdCliente(rs.getInt("idcliente"));
				c.setIdConcesionario(rs.getInt("idconcesionario"));
				c.setIdCoche(rs.getInt("idcoche"));
				c.setFecha(rs.getString("fecha"));
				c.setPrecioVenta(rs.getFloat("precioventa"));
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return c;
	}
	
	/**
	 * 
	 * @return
	 */
	public Venta findSiguiente (int idActual) {
		Venta c = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.venta where id > " + idActual + " order by id limit 1");
			if (rs.next()) {
				c = new Venta();
				c.setId(rs.getInt("id"));
				c.setIdCliente(rs.getInt("idcliente"));
				c.setIdConcesionario(rs.getInt("idconcesionario"));
				c.setIdCoche(rs.getInt("idcoche"));
				c.setFecha(rs.getString("fecha"));
				c.setPrecioVenta(rs.getFloat("precioventa"));
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return c;
	}
	


	/**
	 * 
	 * @return
	 */
	public Venta findAnterior (int idActual) {
		Venta c = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.venta where id < " + idActual + " order by id desc limit 1");
			if (rs.next()) {
				c = new Venta();
				c.setId(rs.getInt("id"));
				c.setIdCliente(rs.getInt("idcliente"));
				c.setIdConcesionario(rs.getInt("idconcesionario"));
				c.setIdCoche(rs.getInt("idcoche"));
				c.setFecha(rs.getString("fecha"));
				c.setPrecioVenta(rs.getFloat("precioventa"));
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return c;
	}
	
	/**
	 * 
	 * @return
	 */
	public int modificar (Venta c) {
		int registrosAfectados = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 

			registrosAfectados = s.executeUpdate ("update venta set idcliente='" + c.getIdCliente() + "', " +
					"idconcesionario='" + c.getIdConcesionario() + "idcoche='" + c.getIdCoche() + "fecha='" + c.getFecha() + "precioventa='" + c.getPrecioVenta() + "' where id=" + c.getId() + ";");
		   	
			// Cierre de los elementos
			s.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return registrosAfectados;
		
	}

	/**
	 * 
	 * @param c
	 * @return
	 */
	public int nuevo (Venta c) {
		int registrosAfectados = 0;
		int idNuevoRegistro = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 

			idNuevoRegistro = nextId();
			registrosAfectados = s.executeUpdate ("insert into venta values(" + idNuevoRegistro + ", " +
			"'" + c.getIdCliente() + "', '" + c.getIdConcesionario() + "', '" + c.getIdCoche() + "', '" + c.getFecha() + "', '" + c.getPrecioVenta() + "');");
		   	
			// Cierre de los elementos
			s.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return idNuevoRegistro;

	}

	/**
	 * 
	 * @return
	 * @throws SQLException
	 */
	private int nextId () throws SQLException {
		Statement s = (Statement) this.conn.createStatement();

		String sql = "select max(id) from tutorialjavacoches.venta";
		ResultSet rs = s.executeQuery(sql);
		int max = 1; 
		if (rs.next() ) {
			max = rs.getInt(1);
		}
		rs.close();
		s.close();
		return max + 1;
	}
	
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public int borrar(int id) {
		int registrosAfectados = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 

			registrosAfectados = s.executeUpdate ("delete from venta where id=" + id + ";");
			
			// Cierre de los elementos
			s.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return registrosAfectados;
	}

}
