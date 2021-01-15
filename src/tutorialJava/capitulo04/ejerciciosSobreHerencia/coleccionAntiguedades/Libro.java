package tutorialJava.capitulo04.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Libro extends Cosa{

	protected String autor;
	
	@Override
	public String toString() {
		return nombre + " | Tipo: " + tipo + " | Precio: " + precio + "€ | Antigüedad: " + anio + " años | Origen: " + origen + " | Autor: " + autor;
	}

	/**
	 * @param nombre
	 * @param precio
	 * @param anio
	 * @param origen
	 * @param autor
	 */
	public Libro(String nombre,String tipo,double precio, int anio, String origen, String autor) {
		super(nombre, tipo, precio, anio, origen);
		this.autor = autor;
	}
}

