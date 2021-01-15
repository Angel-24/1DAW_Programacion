package tutorialJava.capitulo04.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Cosa {

	protected String tipo;
	protected String nombre;
	protected double precio;
	protected int anio;
	protected String origen;

	/**
	 * @param nombre
	 * @param tipo 
	 * @param precio
	 * @param anio
	 * @param origen
	 */
	public Cosa(String nombre, String tipo, double precio, int anio, String origen) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
		this.anio = anio;
		this.origen = origen;
	}



	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	@Override
	public String toString() {
		return nombre + " | Tipo: " + tipo + " | Precio: " + precio + "€ | Antigüedad: " + anio + " años | Origen: " + origen;
	}
}
