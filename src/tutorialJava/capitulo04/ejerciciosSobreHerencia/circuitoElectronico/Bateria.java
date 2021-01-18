package tutorialJava.capitulo04.ejerciciosSobreHerencia.circuitoElectronico;

public class Bateria extends Componente {

	protected String voltaje;

	@Override
	public String toString() {
		return nombre + voltaje;
	}
	
	/**
	 * @param nombre
	 * @param tipo
	 * @param precio
	 * @param anio
	 * @param origen
	 */
	
	
	
	
	public Bateria(String nombre,String tipo,double precio,int anio,String origen,String material) {
		super(nombre,voltaje);
		this.voltaje = voltaje;
	}
}