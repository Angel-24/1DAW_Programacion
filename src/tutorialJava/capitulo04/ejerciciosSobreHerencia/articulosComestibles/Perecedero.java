package tutorialJava.capitulo04.ejerciciosSobreHerencia.articulosComestibles;

public class Perecedero extends Articulo{

	protected String fecha;

	@Override
	public String toString() {
		return "[" + nombre + " |  " + precio + " €  |  ID = " + codigo + " | Caduca en: " + fecha + "]";
	}

	/**
	 * @param nombre
	 * @param d
	 * @param codigo
	 * @param fecha
	 */
	public Perecedero(String nombre, double d, int codigo, String fecha) {
		super(nombre, d, codigo, fecha);
		this.fecha = fecha;
	}
}

