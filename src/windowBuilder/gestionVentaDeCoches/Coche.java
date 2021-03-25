package windowBuilder.gestionVentaDeCoches;

public class Coche {

	private int id;
	private int idfabricante;
	private String nombre;
	private String bastidor;
	private String modelo;
	private String color;
	
	public Coche() {
		// TODO Auto-generated constructor stub
	}

	public Coche(int id, int idfabricante, String bastidor, String modelo, String color) {
		super();
		this.id = id;
		this.idfabricante = idfabricante;
		this.bastidor = bastidor;
		this.modelo = modelo;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Coche [id=" + id + ", idfabricante=" + idfabricante + ", bastidor=" + bastidor + ", modelo=" + modelo + ", color=" + color + "]";
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
	 * @return the idfabricante
	 */
	public int getIdFabricante() {
		return idfabricante;
	}

	/**
	 * @param cif the idfabricante to set
	 */
	public void setIdFabricante(int idfabricante) {
		this.idfabricante = idfabricante;
	}

	/**
	 * @return the bastidor
	 */
	public String getBastidor() {
		return bastidor;
	}

	/**
	 * @param nombre the bastidor to set
	 */
	public void setBastidor(String bastidor) {
		this.bastidor = bastidor;
	}
	
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param nombre the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param nombre the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
}
