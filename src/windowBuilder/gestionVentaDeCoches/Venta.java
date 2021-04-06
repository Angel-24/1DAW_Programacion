package windowBuilder.gestionVentaDeCoches;

public class Venta {

	private int id;
	private int idcliente;
	private int idconcesionario;
	private int idcoche;
	private String fecha;
	private float precioventa;
	
	public Venta() {
		// TODO Auto-generated constructor stub
	}

	public Venta(int id, int idcliente, int idconcesionario, int idcoche, String fecha, int precioventa) {
		super();
		this.id = id;
		this.idcliente = idcliente;
		this.idconcesionario = idconcesionario;
		this.idcoche = idcoche;
		this.fecha = fecha;
		this.precioventa = precioventa;
	}

	@Override
	public String toString() {
		return "Fabricante [id=" + id + ", idcliente=" + idcliente + ", idconcesionario=" + idconcesionario + ", idcoche="+idcoche + ", fecha="+fecha+ ", precioventa="+precioventa + " ]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public int getIdCliente() {
		return idcliente;
	}

	public void setIdCliente(int idcliente) {
		this.idcliente = idcliente;
	}
	
	
	public int getIdConcesionario() {
		return idconcesionario;
	}
	
	public void setIdConcesionario(int idconcesionario) {
		this.idconcesionario = idconcesionario;
	}
	
	
	public int getIdCoche() {
		return idcoche;
	}
	
	public void setIdCoche(int idcoche) {
		this.idcoche = idcoche;
	}
	
	
	public String getFecha() {
		return fecha;
	}
	
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
	public float getPrecioVenta() {
		return precioventa;
	}
	
	public void setPrecioVenta(float precioventa) {
		this.precioventa = precioventa;
	}
	
}
