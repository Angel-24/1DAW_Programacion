package windowBuilder.gestionVentaDeCoches;

public class Venta {

	private int id;
	private String cif;
	private String nombre;
	
	public Venta() {
		// TODO Auto-generated constructor stub
	}

	public Venta(int id, String cif, String nombre) {
		super();
		this.id = id;
		this.cif = cif;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Fabricante [id=" + id + ", cif=" + cif + ", nombre=" + nombre + "]";
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the cif
	 */
	public String getCif() {
		return cif;
	}

	/**
	 * @param cif the cif to set
	 */
	public void setCif(String cif) {
		this.cif = cif;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
}
