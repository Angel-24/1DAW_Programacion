package tutorialJava.capitulo04.ejerciciosSobreHerencia.circuitoElectronico;

public class ComponenteBateria extends Componente {

	protected double voltios;

	@Override
	public String toString() {
		return a.nombre +" ...[   "+ nombre +"   |  "+ voltios +" V  ]... "+ b.nombre;
	}
	
	/**
	 * @param a
	 * @param nombre
	 * @param voltios
	 * @param b
	 */
	
	public ComponenteBateria(String nombre, double voltios) {
		super(nombre);
		this.voltios = voltios;
	}
}