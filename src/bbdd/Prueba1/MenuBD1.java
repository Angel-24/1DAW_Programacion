package bbdd.Prueba1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class MenuBD1 {

	private static String tablas[] = new String[] {"venta", "concesionario", "cliente", "coche", "fabricante"};
	private static String nombres[] = new String[] {"Eva", "Juan", "Carmen", "Pablo", "Rafa", "Pilar", "Pedro", 
			"Lola", "Casimiro", "Gertrudis", "Eustaquio", "Gerarda", "Nepomunosio", "Argimira", "Ascensio", "Baltasara", "Baudilio", "Bernabea"};
	private static String apellidos[] = new String[] {"Gonzalez", "Lopez", "Gutierrez", "Ruiz", "Jurado", "Carrasco", "Flores", 
			"Sanchez", "Bose", "Martin", "Martinez", "Santos", "Pozo", "Quijano", "Romero", "Pisano", "Cuevas", "Sanz"};
	private static String tiposEmpresas[] = new String[] {"Hermanos", "Sociedad", "Concesionario", "Coches de"};
	private static String localidades[] = new String[] {"Lucena", "Cabra", "Priego de Cordoba", "Puente Genil", "Benameji", "Palenciana","Baena","Albendin", "Moriles", "Rute", "Aguilar de la Frontera"};
	private static String fabricantes[] = new String[] {"Renault", "Citroen", "Peugeot", "Dacia", "Kia", "Hyundai", "Honda"};
	private static String colores[] = new String[] {"Blanco", "Negro", "Azul", "Rojo", "Verde", "Amarillo", "Gris"};
	private static String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
	private static SimpleDateFormat sdfFechaNacimiento = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private static int CONT_NOTIFICACION_INSERCION = 10;
	private static int REGISTROS_A_INSERTAR_EN_CONCESIONARIO = 20;
	private static int REGISTROS_A_INSERTAR_EN_CLIENTE = 200;
	private static int REGISTROS_A_INSERTAR_EN_COCHE = 200;
	private static boolean LOG = true;
	
	
	
	
	public static void main(String[] args) {

		try {
			
			menu();
			
			
//			long startTime = new Date().getTime();
			
//			Connection conn;
//			conn = ConnectionManagerV2.getConexion();
			
//			 Limpieza en las tablas
//			vaciarTablas(conn);
			// Datos de concesionarios
//			creacionDatosConcesionario(conn);
			// Datos de clientes
//			creacionDatosCliente(conn);
			// Datos de fabricantes
//			creacionDatosFabricantes(conn);
			// Datos de coches
//			creacionDatosCoches(conn);
			// Datos de venta
//			creacionDatosVentas(conn);
			
//			long usedMillis = new Date().getTime() - startTime;
//			int secs = (int) (usedMillis/1000);
//			System.out.println("\nProceso terminado en " + secs + " segundos y " + (usedMillis - secs * 1000) + " milisegundos");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	
	public static void menu() throws SQLException {
		
		String menu = null;
		int salir = 1;

		while (salir != 0) {

			menu = JOptionPane.showInputDialog(null, " 1   -   Listar \n" + " 2   -   Nuevo \n"
					+ " 3   -   Eliminar \n" + " 4   -   Editar \n\n", "--- Menú ---", -1);

			if (menu.isEmpty() || menu == null || Integer.parseInt(menu) == 0) {
					salir = JOptionPane.showConfirmDialog(null, "¿Salir?", "", 0);
			} else if (Integer.parseInt(menu) == 1) {
				consultaBasica();
			} else if (Integer.parseInt(menu) == 2) {
				nuevoFabricante();
			} else if (Integer.parseInt(menu) == 3) {
				eliminarFabricante();
			} else if (Integer.parseInt(menu) == 4) {
				editarFabricante();
			}
		}
	}

	private static void consultaBasica() {
		try {
			// A trav�s de la siguiente l�nea comprobamos si tenemos acceso al driver MySQL,
			// si no fuera as�
			// no podemos trabajar con esa BBDD.
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Necesitamos obtener un acceso a la BBDD, eso se materializa en un objeto de
			// tipo Connection, al cual
			// le tenemos que pasar los par�metros de conexi�n.
			Connection conexion = (Connection) DriverManager
					.getConnection("jdbc:mysql://localhost/tutorialjavacoches?serverTimezone=UTC", "java", "1234");

			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo
			// Statement
			Statement s = (Statement) conexion.createStatement();

			// La ejecuci�n de la consulta se realiza a trav�s del objeto Statement y se
			// recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros
			// obtenidos por la consulta
			ResultSet rs = s.executeQuery("select * from fabricante");

			// Navegaci�n del objeto ResultSet
			System.out.println("ID |    CIF    | Nombre\n"
							 + "---+-----------+----------");
			while (rs.next()) {
				System.out.println(" " + rs.getInt("id") + " | " + rs.getString(2) + " | " + rs.getString(3));
			}
			// Cierre de los elementos
			rs.close();
			s.close();
			conexion.close();
		} catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		} catch (SQLException ex) {
			System.out.println("Error en la ejecuci�n SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	
//	private static void nuevoFabricante (Connection conn) throws SQLException/*, ImposibleConectarException*/ {
	private static void nuevoFabricante () throws SQLException/*, ImposibleConectarException*/ {
		Connection conn = (Connection) DriverManager
				.getConnection("jdbc:mysql://localhost/tutorialjavacoches?serverTimezone=UTC", "java", "1234");

		Statement s = (Statement) conn.createStatement();
		int registrosInsertados;
		int contRegistrosInsertados = 0;		
		
		if (LOG)
			System.out.println("\nInsertando registros en la tabla fabricante");

//		for (int i = 0; i < fabricantes.length; i++) {
			String cif = JOptionPane.showInputDialog("cif");
			String nombre = JOptionPane.showInputDialog("nombre");
			
			String sql = "INSERT INTO tutorialjavacoches.fabricante (id, cif, nombre) " + "VALUES  (" + nextIdEnTabla(conn, "fabricante") + ", '" + cif + "', '" + nombre + "')";
			registrosInsertados = s.executeUpdate(sql);
			if (registrosInsertados != 1) {
				throw new SQLException ("No ha sido posible la inserci�n con la cadena:\n" + sql);
			}
			contRegistrosInsertados++;
			if (contRegistrosInsertados % CONT_NOTIFICACION_INSERCION == 0 && LOG) {
				System.out.println("\t" + contRegistrosInsertados + " registros insertados en tabla fabricante");
			}
//		}
		s.close();
	}
	
	private static void eliminarFabricante () throws SQLException/*, ImposibleConectarException*/ {
		Connection conn = (Connection) DriverManager
				.getConnection("jdbc:mysql://localhost/tutorialjavacoches?serverTimezone=UTC", "java", "1234");

		Statement s = (Statement) conn.createStatement();
		int registrosInsertados;
		int contRegistrosInsertados = 0;		
		
		if (LOG)
			System.out.println("\nEliminando registros en la tabla fabricante");

			String id = JOptionPane.showInputDialog("id");
			
			String sql = "DELETE tutorialjavacoches.fabricante (id=" + id + ");";
			registrosInsertados = s.executeUpdate(sql);
			if (registrosInsertados != 1) {
				throw new SQLException ("No ha sido posible la inserci�n con la cadena:\n" + sql);
			}
			contRegistrosInsertados++;
			if (contRegistrosInsertados % CONT_NOTIFICACION_INSERCION == 0 && LOG) {
				System.out.println("\t" + contRegistrosInsertados + " registros insertados en tabla fabricante");
			}
//		}
		s.close();
	}
	
	private static void editarFabricante () throws SQLException/*, ImposibleConectarException*/ {
		Connection conn = (Connection) DriverManager
				.getConnection("jdbc:mysql://localhost/tutorialjavacoches?serverTimezone=UTC", "java", "1234");

		Statement s = (Statement) conn.createStatement();
		int registrosInsertados;
		int contRegistrosInsertados = 0;		
		
		if (LOG)
			System.out.println("\nInsertando registros de en la tabla fabricante");

//		for (int i = 0; i < fabricantes.length; i++) {
			String cif = JOptionPane.showInputDialog("cif");
			String nombre = JOptionPane.showInputDialog("nombre");
			
			String sql = "INSERT INTO tutorialjavacoches.fabricante (id, cif, nombre) " + "VALUES  (" + nextIdEnTabla(conn, "fabricante") + ", '" + cif + "', '" + nombre + "')";
			registrosInsertados = s.executeUpdate(sql);
			if (registrosInsertados != 1) {
				throw new SQLException ("No ha sido posible la inserci�n con la cadena:\n" + sql);
			}
			contRegistrosInsertados++;
			if (contRegistrosInsertados % CONT_NOTIFICACION_INSERCION == 0 && LOG) {
				System.out.println("\t" + contRegistrosInsertados + " registros insertados en tabla fabricante");
			}
//		}
		s.close();
	}
	
	private static int nextIdEnTabla (Connection conn, String tabla) throws SQLException {
		return maxIdEnTabla(conn, tabla) + 1;
	}
	
	private static int maxIdEnTabla (Connection conn, String tabla) throws SQLException {
		Statement s = (Statement) conn.createStatement();

		String sql = "select max(id) from tutorialjavacoches." + tabla;
		ResultSet rs = s.executeQuery(sql);
		int max = 1; 
		if (rs.next() ) {
			max = rs.getInt(1);
		}
		rs.close();
		s.close();
		return max;
	}
	public void ImposibleConectarException(String message) {
		return;
	}
	
}