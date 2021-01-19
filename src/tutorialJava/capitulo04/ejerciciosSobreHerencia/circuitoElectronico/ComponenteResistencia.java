package tutorialJava.capitulo04.ejerciciosSobreHerencia.circuitoElectronico;

public class ComponenteResistencia extends Componente{

	protected double ohmios;

	@Override
	public String toString() {
		return a.nombre +"     ...[ "+ nombre +" |  "+ ohmios + " Ω  ]... "+ b.nombre;
	}
	
	/**
	 * @param a
	 * @param nombre
	 * @param ohmios
	 * @param b
	 */
	
	public ComponenteResistencia(String nombre, double ohmios) {
		super(nombre);
		this.ohmios = ohmios;
	}
}
