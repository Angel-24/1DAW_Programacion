package tutorialJava.capitulo04.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Roca extends Cosa {

	protected String anio1 = "??";
	protected String procedencia;
	protected String epoca;
	
	@Override
	public String toString() {
		return nombre + " | Tipo: " + tipo + " | Precio: " + precio + "€ | Antigüedad: " + anio1 + " años | Origen: " + origen + " | Procedencia: " + procedencia + " | Época: " + epoca;
	}
	
	/**
	 * @param nombre
	 * @param tipo
	 * @param precio
	 * @param invalid
	 * @param origen
	 */
	
	
	
	
	public Roca(String nombre,String tipo,double precio, int anio, String anio1, String origen,String procedencia, String epoca) {
		super(nombre, tipo, precio, anio, origen);
		this.anio1 = anio1;
		this.procedencia = procedencia;
		this.epoca = epoca;
	}
}
