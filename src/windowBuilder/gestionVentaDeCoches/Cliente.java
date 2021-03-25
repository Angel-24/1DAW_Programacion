package windowBuilder.gestionVentaDeCoches;

public class Cliente {

	private int id;
	private String nombre;
	private String apellidos;
	private String localidad;
	private String dninie;
	private String fechanac;
	private int activo;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(int id, String nombre, String apellidos, String localidad, String dninie, String fechanac, int activo ) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.localidad = localidad;
		this.dninie = dninie;
		this.fechanac = fechanac;
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Fabricante [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", localidad="+localidad + ", dninie="+dninie+ ", fechanac="+fechanac + ", activo="+activo+" ]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	
	public String getLocalidad() {
		return localidad;
	}
	
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	
	public String getDniNie() {
		return dninie;
	}
	
	public void setDniNie(String dninie) {
		this.dninie = dninie;
	}
	
	
	public String getFechaNac() {
		return fechanac;
	}
	
	public void setFechaNac(String fechanac) {
		this.fechanac = fechanac;
	}
	
	
	public int getActivo() {
		return activo;
	}
	
	public void setActivo(int activo) {
		this.activo = activo;
	}
}
