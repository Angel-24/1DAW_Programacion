package tutorialJava.capitulo04.ejerciciosSobreHerencia.articulosComestibles;

public class Articulo {

	protected String nombre;
	protected double precio;
	protected int codigo;

	/**
	 * @param nombre
	 * @param d
	 * @param codigo
	 */
	public Articulo(String nombre, double d, int codigo, String fecha) {
		super();
		this.nombre = nombre;
		this.precio = d;
		this.codigo = codigo;
	}



	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	@Override
	public String toString() {
		return "[" + nombre + " |  " + precio + " €  |  ID = " + codigo + "]";
	}
}
