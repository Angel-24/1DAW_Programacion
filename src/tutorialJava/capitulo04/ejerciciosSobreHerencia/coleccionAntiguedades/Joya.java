package tutorialJava.capitulo04.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Joya extends Cosa {

	protected String material;
	
	@Override
	public String toString() {
		return nombre + " | Tipo: " + tipo + " | Precio: " + precio + "€ | Antigüedad: " + anio + " años | Origen: " + origen + " | Material: " + material;
	}
	
	/**
	 * @param nombre
	 * @param tipo
	 * @param precio
	 * @param anio
	 * @param origen
	 */
	
	
	
	
	public Joya(String nombre,String tipo,double precio,int anio,String origen,String material) {
		super(nombre, tipo, precio, anio, origen);
		this.material = material;
	}
}
