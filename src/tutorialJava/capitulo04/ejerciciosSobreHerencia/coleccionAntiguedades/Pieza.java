package tutorialJava.capitulo04.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Pieza extends Cosa {

	protected String utilidad;
	protected String procedencia;
	
	@Override
	public String toString() {
		return nombre + " | Tipo: " + tipo + " | Precio: " + precio + "€ | Antigüedad: " + anio + " años | Origen: " + origen + " | Utilidad: " + utilidad + " | Procedencia: " + procedencia;
	}
	
	/**
	 * @param nombre
	 * @param tipo
	 * @param precio
	 * @param anio
	 * @param origen
	 */
	
	
	
	
	public Pieza(String nombre,String tipo,double precio,int anio,String origen,String utilidad, String procedencia) {
		super(nombre, tipo, precio, anio, origen);
		this.utilidad = utilidad;
		this.procedencia = procedencia;
	}
}
